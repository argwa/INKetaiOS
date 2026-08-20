package com.github.gezimos.inkos.helper

import android.view.KeyEvent
import com.github.gezimos.inkos.data.Constants.Action
import com.github.gezimos.inkos.data.Prefs
object KeyMapperHelper {
    sealed class HomeKeyAction {
        object None : HomeKeyAction()
        object MoveSelectionUp : HomeKeyAction()
        object MoveSelectionDown : HomeKeyAction()
        object PageUp : HomeKeyAction()
        object PageDown : HomeKeyAction()
        object SwipeLeft : HomeKeyAction()
        object SwipeRight : HomeKeyAction()
        object SwipeUp : HomeKeyAction()
        object SwipeDown : HomeKeyAction()
        object LongPressSelected : HomeKeyAction()
    }
    
    object GestureKeyCodes {
        // NOTE: CLOCK/DATE/QUOTE/DOUBLETAP used to live on KEYCODE_6/7/8/2, but those
        // digits are now reserved exclusively for launching the dialer (see
        // digitForDialerKeyCode below), so those shortcuts have been removed.

        // Hardware function keys that replace the touch swipe gestures.
        // While these are active, the equivalent touch swipe gestures are disabled.
        const val GESTURE_UP = KeyEvent.KEYCODE_F1
        const val GESTURE_DOWN = KeyEvent.KEYCODE_F2
        const val GESTURE_LEFT = KeyEvent.KEYCODE_F3
        const val GESTURE_RIGHT = KeyEvent.KEYCODE_F4
    }

    /**
     * Maps a physical dialpad key (0-9, *, #) to the digit/character that should be
     * pre-filled into the phone dialer. Returns null if [keyCode] is not a dialpad key.
     * Note: the CALL/send key is intentionally NOT included here — it does not open
     * the dialer.
     */
    fun digitForDialerKeyCode(keyCode: Int): String? = when (keyCode) {
        KeyEvent.KEYCODE_0 -> "0"
        KeyEvent.KEYCODE_1 -> "1"
        KeyEvent.KEYCODE_2 -> "2"
        KeyEvent.KEYCODE_3 -> "3"
        KeyEvent.KEYCODE_4 -> "4"
        KeyEvent.KEYCODE_5 -> "5"
        KeyEvent.KEYCODE_6 -> "6"
        KeyEvent.KEYCODE_7 -> "7"
        KeyEvent.KEYCODE_8 -> "8"
        KeyEvent.KEYCODE_9 -> "9"
        KeyEvent.KEYCODE_STAR -> "*"
        KeyEvent.KEYCODE_POUND -> "#"
        else -> null
    }

    fun mapHomeKey(prefs: Prefs, keyCode: Int, event: KeyEvent): HomeKeyAction {
        if (event.action != KeyEvent.ACTION_DOWN) return HomeKeyAction.None

        return when (keyCode) {
            // Volume keys for page navigation (if enabled)
            KeyEvent.KEYCODE_VOLUME_UP -> if (prefs.useVolumeKeysForPages) HomeKeyAction.PageUp else HomeKeyAction.None
            KeyEvent.KEYCODE_VOLUME_DOWN -> if (prefs.useVolumeKeysForPages) HomeKeyAction.PageDown else HomeKeyAction.None

            // NOTE: DPAD_LEFT/DPAD_RIGHT used to trigger swipeRightAction/swipeLeftAction
            // (a menu/screen transition), but screen transitions via dpad are disabled —
            // only F1-F4 can trigger those now.

            // F1-F4 replace the touch swipe gestures (up/down/left/right). The touch
            // gestures themselves are disabled on the home screen; these keys are now
            // the exclusive way to trigger those actions (including menu/screen changes).
            GestureKeyCodes.GESTURE_UP -> if (prefs.swipeUpAction != Action.Disabled) HomeKeyAction.SwipeUp else HomeKeyAction.None
            GestureKeyCodes.GESTURE_DOWN -> if (prefs.swipeDownAction != Action.Disabled) HomeKeyAction.SwipeDown else HomeKeyAction.None
            GestureKeyCodes.GESTURE_LEFT -> if (prefs.swipeLeftAction != Action.Disabled) HomeKeyAction.SwipeLeft else HomeKeyAction.None
            GestureKeyCodes.GESTURE_RIGHT -> if (prefs.swipeRightAction != Action.Disabled) HomeKeyAction.SwipeRight else HomeKeyAction.None

            // NOTE: KEYCODE_9 long-press used to open the quick menu, but 9 is now
            // reserved exclusively for the dialer (see digitForDialerKeyCode).

            else -> HomeKeyAction.None
        }
    }
    fun mapAppButtonKey(prefs: Prefs, keyCode: Int, event: KeyEvent): HomeKeyAction {
        return mapHomeKey(prefs, keyCode, event)
    }
}

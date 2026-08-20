<div style="text-align: center;">
	<img src="docs/img/inkos.svg" alt="inkOS logo" height="48">
	<h2>inketaiOS - Fork of InkOS Text based launcher adapted for keitai phones </h2>
    <table>
        <tr>
            <td><img src='fastlane/metadata/android/en-US/images/phoneScreenshots/0.png' height='300' alt=""></td>
            <td><img src='fastlane/metadata/android/en-US/images/phoneScreenshots/1.png' height='300' alt=""></td>
            <td><img src='fastlane/metadata/android/en-US/images/phoneScreenshots/2.png' height='300' alt=""></td>
            <td><img src='fastlane/metadata/android/en-US/images/phoneScreenshots/3.png' height='300' alt=""></td>
        </tr>
        <tr>
            <td><img src='fastlane/metadata/android/en-US/images/phoneScreenshots/4.png' height='300' alt=""></td>
            <td><img src='fastlane/metadata/android/en-US/images/phoneScreenshots/5.png' height='300' alt=""></td>
            <td><img src='fastlane/metadata/android/en-US/images/phoneScreenshots/6.png' height='300' alt=""></td>
            <td><img src='fastlane/metadata/android/en-US/images/phoneScreenshots/7.png' height='300' alt=""></td>
        </tr>
    </table>

</div>

# This project was unfortunately made with AI as I am not a programmer,  please support the original developer [Gezimos](https://github.com/gezimos)!!

# Tested on Android 8.

It works well (tested) on:

- Domoco Aquos SH-02L


# Forked with physical keys in mind

### Features

**Home Screen**
- F1, F2, F3, F4 keys mappable in place of gestures
- Added widget displaying the mapped apps to the F keys
- pressing * and # at the same time opens the launcher settings
- Disabled moving through menus via dpad (now it only work via F keys)

**Everthing else works the same as the original InkOS**

## Permissions

> [!NOTE]
> inkOS does not request internet access and does not collect or transmit any data.

| Permission | Why |
|---|---|
| `QUERY_ALL_PACKAGES` | List all installed apps |
| `REQUEST_DELETE_PACKAGES` | Uninstall apps (requires user confirmation) |
| `EXPAND_STATUS_BAR` | Expand/collapse status bar via gestures |
| `VIBRATE` | Haptic feedback |
| `SET_WALLPAPER` | Set wallpapers |
| `USE_BIOMETRIC` | PIN/fingerprint lock for apps and settings |
| `WRITE_SETTINGS` | Brightness control (Simple Tray) |
| `CAMERA` | Flashlight toggle (Simple Tray) |
| `READ_PHONE_STATE` | Cellular signal display (Simple Tray) |
| `MODIFY_AUDIO_SETTINGS` | Volume control (Simple Tray) |
| `ACCESS_WIFI_STATE` | WiFi status (Simple Tray) |
| `CHANGE_WIFI_STATE` | WiFi toggle (Simple Tray) |
| `BLUETOOTH` | Bluetooth status (Hub, API 30 and below) |
| `BLUETOOTH_ADMIN` | Bluetooth admin (Hub, API 30 and below) |
| `BLUETOOTH_CONNECT` | Bluetooth device info (Hub) |
| `PACKAGE_USAGE_STATS` | Recent/most-used apps (Recents screen) |
| `READ_CONTACTS` | Contact search in app drawer |
| `READ_CALENDAR` | Calendar events widget |
| `READ_MEDIA_IMAGES` | Wallpaper selection |
| `READ_MEDIA_AUDIO` | Music search in app drawer |
| `READ_EXTERNAL_STORAGE` | Media access (Android 12 and below) |
| `BIND_APPWIDGET` | Embed Android widgets on home screen |
| `INSTALL_SHORTCUT` | Legacy shortcut pinning |
| `ACCESS_HIDDEN_PROFILES` | Android 15+ Private Space |

## Built With

| Component | Details |
|---|---|
| **Language** | Kotlin 2.1.20 |
| **UI** | Jetpack Compose 1.10.4, Material3 1.4.0 |
| **Build** | AGP 8.10.1 |
| **Target SDK** | API 26 - 36 (Android 8.0 - 16) |

## License

inketaiOS is open source under the GPLv3 license, giving you the freedom to use, study, modify, and
distribute it. The Copyleft provision ensures these freedoms remain intact, so inkOS will always be
fully open source and customizable by anyone.

## Credits

Originally forked from [InkOS](https://github.com/gezimos/inkOS) which is an amazing launcher, specially on touchscreen devices!

## Support the original developer [Gezimos](https://github.com/gezimos)

<table><tr>
<td><a href="https://buymeacoffee.com/gezimos"><img src="others/bmc-button.png" alt="Buy me a coffee" height="40" style="max-width:200px;"></a></td>
<td valign="middle">inkOS is free, open source, and ad-free forever. If it's made your phone better, consider supporting development.</td>
</tr></table>

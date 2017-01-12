# Appium
Get started with Appium

## Appium

Appium is an open source, cross-platform test automation tool for native, hybrid and mobile web apps, tested on simulators (iOS, FirefoxOS), emulators (Android), and real devices (iOS, Android, FirefoxOS).

## Supported Platforms

* iOS
* Android
* FirefoxOS

## Why Appium?

1. You don't have to recompile your app or modify it in any way, due to use of standard automation APIs on all platforms.
2. You can write tests with your favorite dev tools using any [WebDriver](https://github.com/seleniumhq/selenium-google-code-issue-archive) -compatible language such as Java, Objective-C, JavaScript with Node.js (in [promise](https://github.com/admc/wd), [callback](https://github.com/admc/wd) or [generator](https://github.com/jlipps/yiewd) flavors), PHP, Python, [Ruby](https://github.com/appium/ruby_lib), C#, Clojure, or Perl with the Selenium WebDriver API and language-specific client libraries.
3. You can use any testing framework.
Investing in the [WebDriver](https://github.com/appium/ruby_lib) protocol means you are betting on a single, free and open protocol for testing that has become a defacto standard. Don't lock yourself into a proprietary stack.

If you use Apple's UIAutomation library without Appium you can only write tests using JavaScript and you can only run tests through the Instruments application. Similarly, with Google's UiAutomator you can only write tests in Java. Appium opens up the possibility of true cross-platform native mobile automation. Finally!

## Requirements

Your environment needs to be setup for the particular mobile platforms that you want to run tests on. See below for particular platform requirements.

If you want to run Appium via an npm install, hack with or contribute to Appium, you will need [node.js and npm](https://nodejs.org/en/) 0.10 or greater (use n or brew install node to install Node.js. Make sure you have not installed Node or Appium with sudo, otherwise you'll run into problems). We recommend the latest stable version.

To verify that all of Appium's dependencies are met you can use appium-doctor. Run appium-doctor and supply the --ios or --android flags to verify that all of the dependencies are set up correctly. If running from source, you may have to use ./bin/appium-doctor.js or node bin/appium-doctor.js.

You also need to download the Appium client for your language so you can write tests. The Appium clients are simple extensions to the WebDriver clients.

### iOS Requirements

* Mac OS X 10.7 or higher, 10.9.2 recommended
* XCode >= 4.6.3, 5.1.1 recommended
* Apple Developer Tools (iPhone simulator SDK, command line tools)

### Android Requirements

* [Android SDK](https://developer.android.com/index.html) API >= 17 (Additional features require 18/19)
* Appium supports Android on OS X, Linux and Windows.

### FirefoxOS Requirements

* [Firefox OS Simulator](https://developer.mozilla.org/en/docs/Tools/Firefox_OS_Simulator)

## Quick Start

Kick up an Appium server, and then run a test written in your favorite [WebDriver](https://github.com/seleniumhq/selenium-google-code-issue-archive)-compatible language! You can run an Appium server using node.js or using the application, see below.

### Using Node.js

```
$ npm install -g appium 
$ appium &
```

### Using the App

* [Download the Appium app](https://github.com/appium/appium/releases)
* Run it!

## Writing Tests for Appium

### Steps:

- **Appium Set up** - Before running the project you need to download and install Appium.
- **Android SDK Set up** - Download Android SDK, set up the path appropriately. Create virtual devices. Once the virtual devices are created, launch Appium and start the emulator accordingly.
- **Clone this repository**
- **Open the solution**
- **Rebuild**
- **Run the test**



Happy Testing!!!

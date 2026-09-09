# CTAPDEVL

Learning and portfolio Android apps built for the course **CTAPDEVL —
Applications Development and Emerging Technologies**.

This repository collects the hands-on projects completed throughout the course.
Each subfolder is a self-contained app written in Java with Gradle, exploring a
core Android concept — from basic view interaction to Intents and animations —
as a record of progress and a small portfolio of coursework.

## Table of contents

- [About the course](#about-the-course)

- [Projects](#projects)
- [Installation](#installation)
- [Quick start](#quick-start)
- [Usage](#usage)
- [Known issues and limitations](#known-issues-and-limitations)
- [Getting help](#getting-help)
- [License](#license)
- [Acknowledgments](#acknowledgments)

## About the course

**CTAPDEVL — Applications Development and Emerging Technologies** is a course at **National University (NU)**. It
covers native Android development in Java with Android Studio, progressing from
UI fundamentals through Intents, animations, and local data storage (SQLite),
and culminating in a documented application-development project.

The apps in this repository are the hands-on coursework deliverables. Each maps
to an activity from the course:

| App | Course activity |
| --- | --- |
| `SimpleGreeting` | Week 5 — Lab Activity 1 (first Android app) |
| `ChristmasGreetingCard` | Week 7 — Midterm Activity |
| `CVApp` | Week 10 — Digital CV app |

They are learning exercises and portfolio pieces rather than production
software.

## Projects

| Project | Description | Key concepts | minSdk |
| --- | --- | --- | --- |
| [CVApp](CVApp/) | A digital CV / business card with tappable buttons that open the dialer, an email draft, and a portfolio link. | `Intent` (ACTION_DIAL / ACTION_SENDTO / ACTION_VIEW), `Uri` | 23 |
| [ChristmasGreetingCard](ChristmasGreetingCard/) | An edge-to-edge greeting card with a fade-in tree animation and a Toast button. | `AlphaAnimation`, `EdgeToEdge`, window insets, `Toast` | 24 |
| [SimpleGreeting](SimpleGreeting/) | A name-input greeter that echoes a welcome message, or prompts via Toast when empty. | `EditText`, `TextView`, `Toast`, click listeners | — |

> **Note:** `SimpleGreeting` is a code snippet (a single `MainActivity.java` +
> `activity_main.xml`), not a standalone Gradle project. Drop the two files into
> an Android Studio project to run it.

## Installation

Prerequisites (versions used to build these projects):

- [Android Studio](https://developer.android.com/studio) **2026.1.1**
  (Build `AI-261.23567.138.2611.15613797`)
- **JetBrains Runtime (JDK) 21.0.10** — the JDK bundled with and attached to
  the Android Studio install above
- **Gradle 8.13** with **Android Gradle Plugin 8.13.2** (provided via the
  Gradle wrapper — no separate install needed)
- Android SDK with `compileSdk`/`targetSdk` = API 36

Clone the repository:

```bash
git clone <repository-url>
cd CTAPDEVL
```

## Quick start

Open any project's folder directly in Android Studio:

```bash
# Example: the CV app
cd CVApp
./gradlew installDebug   # build and install on a connected device/emulator
```

Or use **File → Open** in Android Studio and select the `CVApp` or
`ChristmasGreetingCard` folder.

## Usage

### CVApp

Launch the app, then tap:

- **Call** — opens the phone dialer with the contact number pre-filled.
- **Email** — opens your email client with a new message to the contact.
- **Portfolio** — opens the portfolio/LinkedIn link in a browser.

A prebuilt [`app-release.apk`](CVApp/app-release.apk) is included for quick
installation without building:

```bash
adb install CVApp/app-release.apk
```

### ChristmasGreetingCard

Launch the app to see the tree fade in, then tap the button to show a festive
Toast greeting.

### SimpleGreeting

Enter a name and tap **Greet** to see a welcome message. Leaving the field empty
shows a "Please enter your name" Toast.

## Known issues and limitations

- `SimpleGreeting` has no Gradle wrapper or manifest; it must be added to an
  existing project to build.
- Only the default template unit/instrumented tests are present — there is no
  meaningful test coverage yet.
- `CVApp` contains hard-coded personal contact details in
  [`MainActivity.java`](CVApp/app/src/main/java/com/example/cvapp/MainActivity.java).

## Getting help

Open an issue in this repository describing the project, the device/emulator,
and the steps to reproduce.

## License

No license has been specified. These are academic coursework projects; all
rights reserved by the author unless a `LICENSE` file is added. If you are a
fellow student, please treat this as reference material and follow your
institution's academic-integrity policy rather than submitting it as your own.

## Acknowledgments

- Coursework for **CTAPDEVL — Applications Development and Emerging
  Technologies** (National University (NU).
- This README is based on the **[READMINE](https://github.com/mhucka/readmine)**
  template by Michael Hucka, discovered via the
  [awesome-readme](https://github.com/matiassingers/awesome-readme) list.

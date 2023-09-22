# SplashScreen

This is a repository that contains modified files from `androidx.core:core-splashscreen:1.0.1`.


![Android CI](https://github.com/MrRuslanYT/SplashScreen/workflows/Android%20CI/badge.svg)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

**Modifications**

1. Removed the following lines to resolve the issue on android 12+ when the statusBar and navigationBar colors
can't be set from themes.xml:
```
    (activity.window.decorView as ViewGroup).setOnHierarchyChangeListener(hierarchyListener)
```
2. Added the following lines to the file `v31\styles` to remove the unwanted actionbar on android 12+:
```
     <item name="android:windowActionBar">false</item>
     <item name="android:windowNoTitle">true</item>
```

**How To Use**

1. Add the JitPack repository to your build file
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
2. Add the dependency
```
	dependencies {
	        implementation 'com.github.MrRuslanYT:SplashScreen:Tag'
	}
```
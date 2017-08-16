# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in /Users/fweigl/Library/Android/sdk/tools/proguard/proguard-android.txt
# You can edit the include path and order by changing the proguardFiles
# directive in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

-dontusemixedcaseclassnames
-dontskipnonpubliclibraryclasses
-dontskipnonpubliclibraryclassmembers
-dontpreverify
-keepattributes SourceFile,LineNumberTable,*Annotation*,EnclosingMethod,Signature,JavascriptInterface

-dontwarn com.intentsoftware.addapptr.banners.**
-dontwarn com.intentsoftware.addapptr.fullscreens.**
-dontwarn com.intentsoftware.addapptr.nativeads.**

-dontwarn com.smartadserver.**
-dontwarn com.flurry.android.FlurryFullscreenTakeoverActivity
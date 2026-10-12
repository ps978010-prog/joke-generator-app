-keep class com.google.gson.** { *; }
-keepclassmembers class * {
    @com.google.gson.annotations.SerializedName <fields>;
}
-keep class com.squareup.okhttp3.** { *; }
-keep class com.example.jokegenerator.** { *; }

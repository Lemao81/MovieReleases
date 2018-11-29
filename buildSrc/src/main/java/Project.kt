package buildSrc

object App {
    const val applicationId = "com.jueggs.moviereleases"
    const val versionCode = 1
    const val versionName = "1.0"
    const val compileSdkVersion = 28
    const val minSdkVersion = 21
    const val targetSdkVersion = 28
}

object Module {
}

object Dimension {
    const val main = "main"
}

object Flavor {
    const val dev = "dev"
    const val prod = "prod"
}

object Path {
    const val baseProject = "base-project.gradle"
    const val baseAndroidLibrary = "../base-android-library.gradle"
    const val baseJavaLibrary = "../base-java-library.gradle"
    const val baseKotlinAndroidExtension = "../base-kotlin-android-extension.gradle"
    const val baseKapt = "../base-kapt.gradle"
    const val baseDatabinding = "../base-databinding.gradle"
}
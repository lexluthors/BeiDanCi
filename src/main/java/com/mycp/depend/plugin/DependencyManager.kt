package com.mycp.depend.plugin

/**
 * @author: liujie
 * @date: 2021/7/21
 * @description: 第三方依赖库的版本控制
 */
object Versions {
    const val retrofit = "2.9.0"
    const val appcompat = "1.2.0"
    const val coreKtx = "1.6.0"
    const val constraintlayout = "2.0.4"
    const val paging = "3.0.0-alpha01"
    const val timber = "4.5.1"
    const val kotlin = "1.5.21"
    const val kotlinStdlib = "1.5.21"
    const val koin = "2.1.5"
    const val work = "2.2.0"
    const val room = "2.3.0-alpha01"
    const val cardview = "1.0.0"
    const val recyclerview = "1.0.0"
    const val fragment = "1.2.1"
    const val anko = "0.10.8"
    const val xannotations = "1.2.0"

    const val junit = "4.12"
    const val junitExt = "1.1.1"
    const val espressoCore = "3.2.0"
    const val jDatabinding = "1.0.1"
    const val material = "1.3.0"
    const val lifecycleRuntime = "2.3.1"
    const val lifecycleExtensions = "2.2.0"
    const val vectordrawable = "1.1.0"
    const val lifecycleLiveDataKtx = "2.3.1"
    const val lifecycleViewModelKtx = "2.3.1"
    const val navigationFragmentKtx = "2.3.5"
    const val navigationUiKtx = "2.3.5"


    // AndroidX--------------------------------------------------------------
    const val AppCompat = "1.2.0"
    const val CoreKtx = "1.3.1"
    const val ConstraintLayout = "2.0.4"                // 约束布局
    const val TestExtJunit = "1.1.2"
    const val TestEspresso = "3.3.0"
    const val ActivityKtx = "1.1.0"
    const val FragmentKtx = "1.2.5"
    const val MultiDex = "2.0.1"

    // Android---------------------------------------------------------------
    const val Junit = "4.13"
    const val Material = "1.2.0"                        // 材料设计UI套件

    // Kotlin----------------------------------------------------------------
    const val Kotlin = "1.5.10"
    const val Coroutines = "1.5.0"                      // 协程

    // JetPack---------------------------------------------------------------
    const val Lifecycle =
        "2.3.1"                       // Lifecycle相关（ViewModel & LiveData & Lifecycle）
    const val Hilt = "2.35.1"                           // DI框架-Hilt
    const val HiltAndroidx = "1.0.0"

    // GitHub----------------------------------------------------------------
    const val OkHttp = "4.9.0"                          // OkHttp
    const val OkHttpInterceptorLogging = "4.9.1"        // OkHttp 请求Log拦截器
    const val Retrofit = "2.9.0"                        // Retrofit
    const val RetrofitConverterGson = "2.9.0"           // Retrofit Gson 转换器
    const val Gson = "2.8.7"                            // Gson
    const val MMKV = "1.2.9"                            // 腾讯 MMKV 替代SP
    const val AutoSize = "1.2.1"                        // 屏幕适配
    const val ARoute = "1.5.2"                          // 阿里路由
    const val ARouteCompiler = "1.5.2"                  // 阿里路由 APT
    const val RecyclerViewAdapter = "3.0.4"             // RecyclerViewAdapter
    const val StatusBar = "1.5.1"                       // 状态栏
    const val EventBus = "3.2.0"                        // 事件总线
    const val PermissionX = "1.5.0"                     // 权限申请
    const val LeakCanary = "2.7"                        // 检测内存泄漏
    const val AutoService = "1.0"                       // 自动生成SPI暴露服务文件
    const val Coil = "1.3.0"                            // Kotlin图片加载框架
    const val LiveDataBus = "1.8.0"                            // LiveDataBus框架 和eventbus一样
    const val ThreeArouterCompiler = "1.0.3"                            // 第三方的ThreeArouterCompiler
    const val GyArouterCompiler = "1.5.6"                            // 国元nexus仓库ArouterCompiler
    const val GyArouterApi = "1.5.4"                            // 国元nexus仓库GyArouterApi
    const val GyArouterPlugin = "1.5.4"                            // 国元nexus仓库GyArouterPlugin
    const val ArouterAnnotation = "1.0.6"                            // ArouterAnnotation
    const val Logger = "2.2.0"                            // Logger

    // 第三方SDK--------------------------------------------------------------
    const val TencentBugly = "3.3.9"                    // 腾讯Bugly 异常上报
    const val TencentBuglyNative = "3.8.0"              // Bugly native异常上报
    const val TencentTBSX5 = "43939"                    // 腾讯X5WebView
}

object AndroidX {
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val xannotations = "androidx.annotation:annotation:${Versions.xannotations}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
    const val pagingRuntime = "androidx.paging:paging-runtime:${Versions.paging}"

    const val workRuntime = "androidx.work:work-runtime:${Versions.work}"
    const val workTesting = "androidx.work:work-testing:${Versions.work}"
    const val cardView = "androidx.cardview:cardview:${Versions.cardview}"
    const val recyclerview = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime:${Versions.lifecycleRuntime}"
    const val lifecycleExtensions =
        "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycleExtensions}"
    const val vectorDrawable = "androidx.vectordrawable:vectordrawable:${Versions.vectordrawable}"
    const val lifecycleLivedataKtx =
        "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycleLiveDataKtx}"
    const val lifecycleViewModelKtx =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleViewModelKtx}"
    const val navigationFragmentKtx =
        "androidx.navigation:navigation-fragment-ktx:${Versions.navigationFragmentKtx}"
    const val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:${Versions.navigationUiKtx}"

    const val ActivityKtx = "androidx.activity:activity-ktx:${Versions.ActivityKtx}"
    const val FragmentKtx = "androidx.fragment:fragment-ktx:${Versions.FragmentKtx}"
    const val MultiDex = "androidx.multidex:multidex:${Versions.MultiDex}"
    const val LocalBroadcastManager = "androidx.localbroadcastmanager:localbroadcastmanager:1.0.0"
    const val Swiperefreshlayout = "androidx.swiperefreshlayout:swiperefreshlayout:1.1.0"
}

object Room {
    const val runtime = "androidx.room:room-runtime:${Versions.room}"
    const val compiler = "androidx.room:room-compiler:${Versions.room}"
    const val ktx = "androidx.room:room-ktx:${Versions.room}"
    const val rxjava2 = "androidx.room:room-rxjava2:${Versions.room}"
    const val testing = "androidx.room:room-testing:${Versions.room}"
}

object Fragment {
    const val runtime = "androidx.fragment:fragment:${Versions.fragment}"
    const val runtimeKtx = "androidx.fragment:fragment-ktx:${Versions.fragment}"
    const val testing = "androidx.fragment:fragment-testing:${Versions.fragment}"
}

object Kt {
    const val stdlibJdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val stdlibJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlinStdlib}"
    const val test = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
    const val plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"

    const val CoroutinesCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.Coroutines}"
    const val CoroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.Coroutines}"
}

object Koin {
    const val core = "org.koin:koin-core:${Versions.koin}"
    const val androidCore = "org.koin:koin-android:${Versions.koin}"
    const val viewModel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
    const val androidScope = "org.koin:koin-android-scope:$${Versions.koin}"
}

object Anko {
    const val common = "org.jetbrains.anko:anko-common:${Versions.anko}"
    const val sqlite = "org.jetbrains.anko:anko-sqlite:${Versions.anko}"
    const val coroutines = "org.jetbrains.anko:anko-coroutines:${Versions.anko}"
    const val design = "org.jetbrains.anko:anko-design:${Versions.anko}" // For SnackBars
}

object Retrofit {
    const val runtime = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val mock = "com.squareup.retrofit2:retrofit-mock:${Versions.retrofit}"
}

object Depend {

    const val junit = "junit:junit:${Versions.junit}"
    const val androidTestJunit = "androidx.test.ext:junit:${Versions.junitExt}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
    const val jDataBinding = "com.hi-dhl:jdatabinding:${Versions.jDatabinding}"
    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    const val material = "com.google.android.material:material:${Versions.material}"
}

/**
 * @author: liujie
 * @date: 2021/7/15
 * @description: GitHub及其他相关依赖
 */
object GitHub {
    const val OkHttp = "com.squareup.okhttp3:okhttp:${Versions.OkHttp}"
    const val OkHttpInterceptorLogging =
        "com.squareup.okhttp3:logging-interceptor:${Versions.OkHttpInterceptorLogging}"
    const val Retrofit = "com.squareup.retrofit2:retrofit:${Versions.Retrofit}"
    const val Retrofit2AdapterRxjava = "com.squareup.retrofit2:adapter-rxjava2:2.5.0"
    const val Rxjava2 = "io.reactivex.rxjava2:rxjava:2.2.12"
    const val Rxandroid = "io.reactivex.rxjava2:rxandroid:2.1.1"
    const val RetrofitConverterGson =
        "com.squareup.retrofit2:converter-gson:${Versions.RetrofitConverterGson}"
    const val Gson = "com.google.code.gson:gson:${Versions.Gson}"
    const val MMKV = "com.tencent:mmkv-static:${Versions.MMKV}"
    const val AutoSize = "me.jessyan:autosize:${Versions.AutoSize}"
    const val ARoute = "com.alibaba:arouter-api:${Versions.ARoute}"
    const val ARouteCompiler = "com.alibaba:arouter-compiler:${Versions.ARouteCompiler}"
    const val RecyclerViewAdapter =
        "com.github.CymChad:BaseRecyclerViewAdapterHelper:${Versions.RecyclerViewAdapter}"
    const val StatusBar = "com.jaeger.statusbarutil:library:${Versions.StatusBar}"
    const val EventBus = "org.greenrobot:eventbus:${Versions.EventBus}"
    const val EventBusAPT = "org.greenrobot:eventbus-annotation-processor:${Versions.EventBus}"
    const val PermissionX = "com.guolindev.permissionx:permissionx:${Versions.PermissionX}"
    const val LeakCanary = "com.squareup.leakcanary:leakcanary-android:${Versions.LeakCanary}"
    const val AutoService = "com.google.auto.service:auto-service:${Versions.AutoService}"
    const val Javapoet = "com.squareup:javapoet:1.13.0"
    const val AutoServiceAnnotations =
        "com.google.auto.service:auto-service-annotations:${Versions.AutoService}"
    const val Coil = "io.coil-kt:coil:${Versions.Coil}"
    const val CoilGIF = "io.coil-kt:coil-gif:${Versions.Coil}"
    const val CoilSVG = "io.coil-kt:coil-svg:${Versions.Coil}"
    const val CoilVideo = "io.coil-kt:coil-video:${Versions.Coil}"
    const val LiveDataBus = "io.github.jeremyliao:live-event-bus-x:${Versions.LiveDataBus}"
    const val ThreeArouterCompiler =
        "com.weikaiyun.Arouter:arouter-compiler:${Versions.ThreeArouterCompiler}"
    const val GyArouterApi = "com.gyzq.common:mode-arouter-api:${Versions.GyArouterApi}"
    const val GyArouterCompiler = "com.gyzq.common:arouter-compiler:${Versions.GyArouterCompiler}"
    const val GyArouterPlugin = "com.gyzq.common:arouter-gradle-plugin:${Versions.GyArouterPlugin}"
    const val ArouterAnnotation = "com.alibaba:arouter-annotation:${Versions.ArouterAnnotation}"
    const val Segmentcontrol = "com.7heaven.widgets:segmentcontrol:1.17"
    const val BasePopup = "com.github.razerdp:BasePopup:2.2.2"
    const val WechatSdkAndroid = "com.tencent.mm.opensdk:wechat-sdk-android-without-mta:5.5.8"
    const val FacebookRebound = "com.facebook.rebound:rebound:0.3.6"
    const val MagicIndicator = "com.github.hackware1993:MagicIndicator:1.7.0"
    const val Fastjson = "com.alibaba:fastjson:1.2.69"
    const val AndroidSvg = "com.caverock:androidsvg-aar:1.3"

    //    const val Logger = "com.orhanobut:logger:${Versions.Logger}"
    //全局通用md风格dialog，兼容到4.4
    const val MaterialDialogsCore = "com.afollestad.material-dialogs:core:3.3.0"
    const val MaterialDialogsInput = "com.afollestad.material-dialogs:input:3.3.0"
    const val MaterialDialogsFiles = "com.afollestad.material-dialogs:files:3.3.0"
}

object JetPack {
    const val ViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.Lifecycle}"
    const val ViewModelSavedState =
        "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.Lifecycle}"
    const val LiveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.Lifecycle}"
    const val Lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.Lifecycle}"
    const val LifecycleCompilerAPT =
        "androidx.lifecycle:lifecycle-compiler:${Versions.Lifecycle}"
    const val HiltCore = "com.google.dagger:hilt-android:${Versions.Hilt}"
    const val HiltApt = "com.google.dagger:hilt-compiler:${Versions.Hilt}"
    const val HiltAndroidx = "androidx.hilt:hilt-compiler:${Versions.HiltAndroidx}"
}

object MYCP {

}
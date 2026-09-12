plugins {
    alias(kei.plugins.extension)
}

keiyoushi {
    name = "TmoHentai"
    versionCode = 3
    libVersion = "1.6"
    contentWarning = ContentWarning.NSFW

    source {
        lang = "es"
        baseUrl = "https://tmohentai.com"
    }
}

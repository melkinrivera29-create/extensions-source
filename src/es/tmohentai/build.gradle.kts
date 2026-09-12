plugins {
    alias(kei.plugins.extension)
}

keiyoushi {
    name = "TmoHentai"
    className = "TmoHentai"
    versionCode = 2
    libVersion = "1.6"
    contentWarning = ContentWarning.NSFW
    source {
        lang = "es"
        baseUrl = "https://tmohentai.com"
    }
}

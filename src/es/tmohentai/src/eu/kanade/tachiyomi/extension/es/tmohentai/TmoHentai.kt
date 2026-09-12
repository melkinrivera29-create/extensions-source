package eu.kanade.tachiyomi.extension.es.tmohentai

import eu.kanade.tachiyomi.network.GET
import eu.kanade.tachiyomi.source.model.FilterList
import eu.kanade.tachiyomi.source.model.Page
import eu.kanade.tachiyomi.source.model.SChapter
import eu.kanade.tachiyomi.source.model.SManga
import eu.kanade.tachiyomi.source.online.ParsedHttpSource
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element

class TmoHentai : ParsedHttpSource() {
    override val name = "TmoHentai"
    override val baseUrl = "https://tmohentai.app"
    override val lang = "es"
    override val supportsLatest = true

    override fun popularMangaSelector() = "div.grid a"
    override fun popularMangaFromElement(element: Element) = SManga.create().apply {
        title = element.attr("title")
        setUrlWithoutDomain(element.attr("href"))
    }
    override fun popularMangaRequest(page: Int) = GET("$baseUrl/biblioteca?orden=popular&page=$page", headers)
    override fun popularMangaNextPageSelector() = "a[rel=next]"

    override fun searchMangaSelector() = popularMangaSelector()
    override fun searchMangaFromElement(element: Element) = popularMangaFromElement(element)
    override fun searchMangaNextPageSelector() = popularMangaNextPageSelector()
    override fun searchMangaRequest(page:

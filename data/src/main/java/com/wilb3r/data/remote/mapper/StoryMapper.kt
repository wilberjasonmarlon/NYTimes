package com.wilb3r.data.remote.mapper

import com.wilb3r.domain.model.model_domain.Multimedia
import com.wilb3r.domain.model.model_domain.Story
import com.wilb3r.domain.model.model_remote.StoryDto


fun StoryDto.map() = Story(
    `abstract` = `abstract`,
    byline = byline,
    createdDate = createdDate,
    desFacet = desFacet,
    geoFacet = geoFacet,
    itemType = itemType,
    kicker = kicker,
    materialTypeFacet = materialTypeFacet,
    multimedia = multimedia as ArrayList<Multimedia>?,
    orgFacet = orgFacet,
    perFacet = perFacet,
    publishedDate = publishedDate,
    section = section,
    shortUrl = shortUrl,
    subsection = subsection,
    title = title,
    updatedDate = updatedDate,
    uri = uri,
    url = url
)
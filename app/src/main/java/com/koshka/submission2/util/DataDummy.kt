package com.koshka.submission2.util

import com.koshka.submission2.data.local.MovieEntity

object DataDummy {
    fun generateDummyMovie(): ArrayList<MovieEntity> {
        val movies = ArrayList<MovieEntity>()

        movies.add(
            MovieEntity(
                567189,
                "Tom Clancy's Without Remorse",
                "2021-04-29",
                "An elite Navy SEAL uncovers an international conspiracy while seeking justice for the murder of his pregnant wife.",
                7.3,
                "/rEm96ib0sPiZBADNKBHKBv5bve9.jpg"
            )
        )

        movies.add(
            MovieEntity(
                460465,
                "Mortal Kombat",
                "2021-04-07",
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                7.6,
                "/nkayOAUBUu4mMvyNf9iHSUiPjF1.jpg"
            )
        )
        movies.add(
            MovieEntity(
                399566,
                "Godzilla vs. Kong",
                "2021-03-24",
                "In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.",
                8.1,
                "/pgqgaUx1cJb5oZQQ5v0tNARCeBp.jpg"
            )
        )
        movies.add(
            MovieEntity(
                615457,
                "Nobody",
                "2021-03-26",
                "Hutch Mansell, a suburban dad, overlooked husband, nothing neighbor — a \\\"nobody.\\\" When two thieves break into his home one night, Hutch's unknown long-simmering rage is ignited and propels him on a brutal path that will uncover dark secrets he fought to leave behind.",
                8.4,
                "/oBgWY00bEFeZ9N25wWVyuQddbAo.jpg"
            )
        )
        movies.add(
            MovieEntity(
                811367,
                "22 vs. Earth",
                "2021-04-30",
                "et before the events of ‘Soul’, 22 refuses to go to Earth, enlisting a gang of 5 new souls in attempt of rebellion. However, 22’s subversive plot leads to a surprising revelation about the meaning of life.",
                7.2,
                "/32vLDKSzcCMh55zqqaSqqUA8naz.jpg"
            )
        )



        return movies
    }
}
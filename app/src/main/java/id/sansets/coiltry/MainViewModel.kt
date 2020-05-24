package id.sansets.coiltry

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * Created by Sandi on 25/05/2020.
 */
class MainViewModel : ViewModel() {

    private val _movies = MutableLiveData<List<Movie>>()
    val movies: LiveData<List<Movie>> = _movies

    init {
        loadMovies()
    }

    private fun loadMovies() {
        _movies.postValue(
            listOf(
                Movie(
                    id = 419704,
                    title = "Ad Astra",
                    posterUrl = "https://image.tmdb.org/t/p/w342/xBHvZcjRiWyobQ9kxBhO6B2dtRI.jpg"
                ),
                Movie(
                    id = 38700,
                    title = "Bad Boys for Life",
                    posterUrl = "https://image.tmdb.org/t/p/w342/y95lQLnuNKdPAzw9F9Ab8kJ80c3.jpg"
                ),
                Movie(
                    id = 530915,
                    title = "1917",
                    posterUrl = "https://image.tmdb.org/t/p/w342/AuGiPiGMYMkSosOJ3BQjDEAiwtO.jpg"
                ),
                Movie(
                    id = 475557,
                    title = "Joker",
                    posterUrl = "https://image.tmdb.org/t/p/w342/udDclJoHjfjb8Ekgsd4FDteOkCU.jpg"
                ),
                Movie(
                    id = 290859,
                    title = "Terminator: Dark Fate",
                    posterUrl = "https://image.tmdb.org/t/p/w342/vqzNJRH4YyquRiWxCCOH0aXggHI.jpg"
                ),
                Movie(
                    id = 449924,
                    title = "Ip Man 4: The Finale",
                    posterUrl = "https://image.tmdb.org/t/p/w342/yJdeWaVXa2se9agI6B4mQunVYkB.jpg"
                ),
                Movie(
                    id = 181812,
                    title = "Star Wars: The Rise of Skywalker",
                    posterUrl = "https://image.tmdb.org/t/p/w342/db32LaOibwEliAmSL2jjDF6oDdj.jpg"
                ),
                Movie(
                    id = 420809,
                    title = "Maleficent: Mistress of Evil",
                    posterUrl = "https://image.tmdb.org/t/p/w342/vloNTScJ3w7jwNwtNGoG8DbTThv.jpg"
                ),
                Movie(
                    id = 512200,
                    title = "Jumanji: The Next Level",
                    posterUrl = "https://image.tmdb.org/t/p/w342/jyw8VKYEiM1UDzPB7NsisUgBeJ8.jpg"
                ),
                Movie(
                    id = 501170,
                    title = "Doctor Sleep",
                    posterUrl = "https://image.tmdb.org/t/p/w342/p69QzIBbN06aTYqRRiCOY1emNBh.jpg"
                )
            )
        )
    }
}
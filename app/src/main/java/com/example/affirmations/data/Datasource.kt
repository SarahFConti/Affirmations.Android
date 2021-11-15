package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation



class Datasource {

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.image11),
            Affirmation(R.string.affirmation2, R.drawable.image12),
            Affirmation(R.string.affirmation3, R.drawable.image13),
            Affirmation(R.string.affirmation4, R.drawable.image14),
            Affirmation(R.string.affirmation5, R.drawable.image15),
            Affirmation(R.string.affirmation6, R.drawable.image16),
            Affirmation(R.string.affirmation7, R.drawable.image17),
            Affirmation(R.string.affirmation8, R.drawable.image18)


        )
    }

}
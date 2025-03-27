package com.example.fitnessapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.fitnessapp.R

data class FitnessChallenge(
    @StringRes val description: Int,
    @DrawableRes val imageResourceId: Int
)

val fitnessChallenges = listOf(
    FitnessChallenge(R.string.day_1, R.drawable.push_ups),
    FitnessChallenge(R.string.day_2, R.drawable.squats),
    FitnessChallenge(R.string.day_3, R.drawable.jumping_jacks),
    FitnessChallenge(R.string.day_4, R.drawable.yoga),
    FitnessChallenge(R.string.day_5, R.drawable.sit_ups),
    FitnessChallenge(R.string.day_6, R.drawable.lunges),
    FitnessChallenge(R.string.day_7, R.drawable.rest),
    FitnessChallenge(R.string.day_8, R.drawable.plank),
    FitnessChallenge(R.string.day_9, R.drawable.mountain_climbers),
    FitnessChallenge(R.string.day_10, R.drawable.burpees),
    FitnessChallenge(R.string.day_11, R.drawable.glute_bridges),
    FitnessChallenge(R.string.day_12, R.drawable.walk),
    FitnessChallenge(R.string.day_13, R.drawable.high_knees),
    FitnessChallenge(R.string.day_14, R.drawable.stretch),
    FitnessChallenge(R.string.day_15, R.drawable.tricep_dips),
    FitnessChallenge(R.string.day_16, R.drawable.calf_raises),
    FitnessChallenge(R.string.day_17, R.drawable.wall_sit),
    FitnessChallenge(R.string.day_18, R.drawable.shoulder_taps),
    FitnessChallenge(R.string.day_19, R.drawable.jump_squats),
    FitnessChallenge(R.string.day_20, R.drawable.side_plank),
    FitnessChallenge(R.string.day_21, R.drawable.walk),
    FitnessChallenge(R.string.day_22, R.drawable.reverse_lunges),
    FitnessChallenge(R.string.day_23, R.drawable.bicycle_crunches),
    FitnessChallenge(R.string.day_24, R.drawable.burpees),
    FitnessChallenge(R.string.day_25, R.drawable.plank),
    FitnessChallenge(R.string.day_26, R.drawable.jumping_jacks),
    FitnessChallenge(R.string.day_27, R.drawable.russian_twists),
    FitnessChallenge(R.string.day_28, R.drawable.yoga),
    FitnessChallenge(R.string.day_29, R.drawable.push_ups),
    FitnessChallenge(R.string.day_30, R.drawable.stretch)
)

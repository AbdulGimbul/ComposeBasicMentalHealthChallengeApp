package com.abdl.mymentalhealthchallenge.data

import com.abdl.mymentalhealthchallenge.R

data class Challenge(
    val title: Int,
    val desc: Int,
    val image: Int,
)

object DataSource {
    val sourcesList = listOf(
        Challenge(R.string.day1, R.string.descDay1, R.drawable.img_day1),
        Challenge(R.string.day2, R.string.descDay2, R.drawable.img_day2),
        Challenge(R.string.day3, R.string.descDay3, R.drawable.img_day3),
        Challenge(R.string.day4, R.string.descDay4, R.drawable.img_day4),
        Challenge(R.string.day5, R.string.descDay5, R.drawable.img_day5),
        Challenge(R.string.day6, R.string.descDay6, R.drawable.img_day6),
        Challenge(R.string.day7, R.string.descDay7, R.drawable.img_day7),
        Challenge(R.string.day8, R.string.descDay8, R.drawable.img_day8),
        Challenge(R.string.day9, R.string.descDay9, R.drawable.img_day9),
        Challenge(R.string.day10, R.string.descDay10, R.drawable.img_day10),
        Challenge(R.string.day11, R.string.descDay11, R.drawable.img_day11),
        Challenge(R.string.day12, R.string.descDay12, R.drawable.img_day12),
        Challenge(R.string.day13, R.string.descDay13, R.drawable.img_day13),
        Challenge(R.string.day14, R.string.descDay14, R.drawable.img_day14),
        Challenge(R.string.day15, R.string.descDay15, R.drawable.img_day15),
        Challenge(R.string.day16, R.string.descDay16, R.drawable.img_day16),
        Challenge(R.string.day17, R.string.descDay17, R.drawable.img_day17),
        Challenge(R.string.day18, R.string.descDay18, R.drawable.img_day18),
        Challenge(R.string.day19, R.string.descDay19, R.drawable.img_day19),
        Challenge(R.string.day20, R.string.descDay20, R.drawable.img_day20),
        Challenge(R.string.day21, R.string.descDay21, R.drawable.img_day21),
        Challenge(R.string.day22, R.string.descDay22, R.drawable.img_day22),
        Challenge(R.string.day23, R.string.descDay23, R.drawable.img_day23),
        Challenge(R.string.day24, R.string.descDay24, R.drawable.img_day24),
        Challenge(R.string.day25, R.string.descDay25, R.drawable.img_day25),
        Challenge(R.string.day26, R.string.descDay26, R.drawable.img_day26),
        Challenge(R.string.day27, R.string.descDay27, R.drawable.img_day27),
        Challenge(R.string.day28, R.string.descDay28, R.drawable.img_day28),
        Challenge(R.string.day29, R.string.descDay29, R.drawable.img_day29),
        Challenge(R.string.day30, R.string.descDay30, R.drawable.img_day30)
    )
}
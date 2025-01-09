package com.app.myjetpackapp.model

import com.app.myjetpackapp.R

object DragonBallData {
    private val llNames = arrayOf(
        "Son Goku", "Son Gohan", "Son Goten", "Vegeta",
        "Future Trunks", "Piccolo", "Master Roshi",
        "Tenshinhan", "Krillin", "Yamcha"
    )

    private val llThumb = intArrayOf(
        R.drawable.son_goku_thumb,
        R.drawable.son_gohan_thumb,
        R.drawable.son_goten_thumb,
        R.drawable.vegeta_thumb,
        R.drawable.future_trunks_thumb,
        R.drawable.piccolo_thumb,
        R.drawable.master_roshi_thumb,
        R.drawable.tenshinhan_thumb,
        R.drawable.krillin_thumb,
        R.drawable.yamcha_thumb
    )

    private val llPhoto = intArrayOf(
        R.drawable.son_goku,
        R.drawable.son_gohan,
        R.drawable.son_goten,
        R.drawable.vegeta,
        R.drawable.future_trunks,
        R.drawable.piccolo,
        R.drawable.master_roshi,
        R.drawable.tenshinhan,
        R.drawable.krillin,
        R.drawable.yamcha
    )

    private val llRace = arrayOf(
        "Saiyan", "Saiyan-Human Hybrid", "Saiyan-Human Hybrid",
        "Saiyan", "Saiyan-Human Hybrid", "Namekian",
        "Human", "Human", "Human", "Human"
    )

    private val llHeight = intArrayOf(
        175, 180, 123, 164, 170, 226, 165, 187, 153, 183
    )

    private val llWeight = intArrayOf(
        62, 72, 26, 56, 60, 116, 44, 75, 45, 68
    )

    private val llTechnique = arrayOf(
        "Kamehameha, GenkiDama, Kaioken",
        "Masenko, Kamehameha, Ultimate Form",
        "Kamehameha",
        "Final Flash, Big Bang Attack",
        "Burning Attack, Masenko",
        "Special Beam Cannon, Makanposappo",
        "Kamehameha, Evil Containment Wave",
        "Tri-Beam, Solar Flare",
        "Destructo Disk, Kamehameha",
        "Wolf Fang Fist, Spirit Ball"
    )

    private val llTransformation = arrayOf(
        "Super Saiyan, Super Saiyan Blue",
        "Super Saiyan, Ultimate Gohan",
        "Super Saiyan",
        "Super Saiyan, Super Saiyan Blue",
        "Super Saiyan",
        "Great Namekian",
        "None",
        "None",
        "None",
        "None"
    )

    private val llShortDescription = arrayOf(
        "The main protagonist of Dragon Ball, known for his strong will and combat abilities.",
        "Goku's eldest son, known for his powerful potential.",
        "Goku's youngest son, who follows in his father’s footsteps.",
        "Prince of the Saiyan race, Goku’s rival and later ally.",
        "The future version of Bulma and Vegeta’s son.",
        "A Namekian warrior and mentor to Gohan.",
        "An elderly but wise martial arts master.",
        "A skilled martial artist with three eyes.",
        "A human fighter, known for his loyalty and courage.",
        "A former bandit and one of Goku's oldest friends."
    )

    private val llDescription = arrayOf(
        "Son Goku (孫そん悟ご空くう), born Kakarot (カカロット), is a Saiyan raised on Earth and the main protagonist of the Dragon Ball series. He is the second born, as well as youngest son and child of Bardock and Gine, the husband of Chi-Chi, and the father of Gohan and Goten. Originally sent to Earth by his parents as an infant, Kakarot was adopted by Grandpa Gohan and renamed Son Goku.A head injury at an early age altered Goku's memory, ridding him of his initial destructive nature and allowing him to grow up to become one of Earth's greatest defenders. Goku constantly strives and trains to be the greatest warrior that he can possibly be, which has kept the Earth and the universe safe from destruction multiple times",
        "Son Gohan (孫そん悟ご飯はん) is a half-breed Saiyan and one of the most prominent characters in the Dragon Ball series. He is the elder son of the series' primary protagonist Goku and his wife Chi-Chi, the older brother of Goten, the husband of Videl and father to Pan. He is named after Goku's adoptive grandfather, Gohan.\n\nUnlike his father, Gohan is a brilliant scholar and lacks a passion for fighting, preferring to do so only when his loved ones are threatened. Nevertheless, he spends much of his life participating in the defense of Earth, often helping to turn the tides when the dormant depths of his power are unleashed",
        "Son Goten (孫そん悟ご天てん Son Goten, Japanese pronunciation: [sõŋgotẽ̞ɴ]) is the youngest son of Goku and his wife Chi-Chi, making him a Saiyan and Earthling hybrid. Goten is Gohan's younger brother and Trunks' best friend.",
        "Vegeta (ベジータ Bejīta), more specifically Vegeta IV (ベジータ四世 Bejīta Yonsei), recognized as Prince Vegeta (ベジータ王子 Bejīta Ōji), is the prince of the fallen Saiyan race and the husband of Bulma, the father of Trunks and Bulla, the eldest son of King Vegeta, as well as one of the main characters of the Dragon Ball series. \n\nRegal, egotistical, and full of pride, Vegeta was once a ruthless, cold-blooded warrior and outright killer, but later abandoned his position in the Frieza Force for a peaceful life on Earth. He would repeatedly fight alongside Universe 7's most powerful warriors in order to protect Earth and his family, as well as to surpass Goku in power.",
        "Future Trunks (未み来らいのトランクス Mirai no Torankusu) is a Saiyan-Earthling hybrid and the son of Vegeta and Bulma, both from an alternate future. By the time Present Trunks was born, the timeline had been drastically altered by Future Trunks' and Cell's trips to the past. Therefore, the two Trunks had completely different lives (as opposed to those who lived before the Time Machines arrived, who lived exactly the same lives as their counterparts until the point at which the two timelines diverge, three years before the androids arrived).\n\nWell-mannered, serious and very cautious, Trunks hails from an alternate timeline in which Future Androids 17 and 18 murdered the Dragon Team and proceeded to create an apocalyptic anarchy on Earth. Trunks is trained by Future Gohan as a teenager and becomes a gifted fighter, swordsman and a Super Saiyan, which are traits that aid him greatly in the battle against the Androids after traveling back in time in order to save his own future.",
        "Piccolo Jr. (ピッコロ・ジュニア Pikkoro Junia, lit. \"Piccolo Junior\"), usually just called Piccolo and also known as Ma Junior (マジュニア Ma Junia), is a Namekian and also the final child and reincarnation of King Piccolo, later becoming the reunification of the Nameless Namekian after fusing with Kami, at which point he was once referred to as Kamiccolo (神コロ様 Kamikoro-sama) by Goku. According to Grand Elder Guru, Piccolo, along with Kami and King Piccolo, are part of the Dragon Clan, who were the original creators of the Dragon Balls.\n\nA wise and cunning warrior, he was the main antagonist in the final saga of Dragon Ball, the Piccolo Jr. Saga, and was thus a ruthless enemy of Goku. However, starting with the first saga of Dragon Ball Z, the Raditz Saga, he began to lose all villainous traits, and when he started training Goku's son Gohan during the Vegeta Saga which led to the two developing a strong bond with each other, he became a permanent member of the Dragon Team and eventually one of Earth's greatest heroes.",
        "Master Roshi (武む天てん老ろう師し Muten Rōshi, lit. \"Old Heavenly Martial Arts Master\"), also known as the Turtle Hermit (亀かめ仙せん人にん Kame Sen'nin) (or Turtle (Kame) in his youth) and God of Martial Arts (武道の神様 Budō no Kami-sama), is a perverted hermit and a master of martial arts. He lives on his own isolated island called Kame House, where he may be willing to train students who travel to his doorstep. He is also the originator of the Kamehameha Wave.\n" +
                "\n" +
                "Despite his lecherous tendencies and his old age, Roshi is an extremely respected and capable warrior, serving as the master of Gohan, Ox-King, Goku, Krillin, and Yamcha. His drive to push his students to new heights and support them on their martial arts journeys makes him one of the most notable supporting characters in the series.",
        "Tien Shinhan (天テン津シン飯ハン or 天てん津しん飯はん Tenshinhan) is a disciplined, reclusive and heavily devoted martial artist, and one of the strongest Earthlings within the Dragon Ball universe. He also possesses a few non-human traits due to being descended from the alien Triclops race.\n" +
                "\n" +
                "He is the main antagonist of the Tien Shinhan Saga and was originally a student of the Crane School who desired revenge against Goku for defeating his mentor, Mercenary Tao, but realized he was on the wrong side with the help of Master Roshi. He battles alongside the other Z Fighters against major threats to the Earth, often courageously engaging enemies far more powerful than himself. However, he spends most of his time training with his lifelong best friend, Chiaotzu.",
        "Krillin (クリリン Kuririn) is a major protagonist in the Dragon Ball series.\n" +
                "\n" +
                "He's one of the most powerful and talented martial artists on Earth. He is courageous, faithful, and good-natured. Krillin had a brief rivalry with Goku when they first trained under Master Roshi, but they quickly became lifelong best friends, to the point that Goku cares for him as much as his family and closest ones. He is a prominent Z Fighter, despite usually being overpowered by the major enemies. His short stature and baldness (with the exception of when he grows out his hair in the Buu Saga onwards, although he occasionally shaves his head in several sagas in Dragon Ball Super) aid him in his ability to provide comic relief during tense moments.\n" +
                "\n" +
                "During the latter half of Dragon Ball Z, he largely retires from fighting, opting to settle down with his family instead, becoming the husband of Android 18 and the father of Marron. However, because of all things that occur during the Golden Frieza Saga, he returns to his lifestyle as a warrior later on in Dragon Ball Super.",
        "Yamcha (ヤムチャ Yamucha) is a major deuteragonist in the Dragon Ball manga and in the anime Dragon Ball, and later a supporting tritagonist in Dragon Ball Z and Dragon Ball Super, with a few appearances in Dragon Ball GT. He is a former boyfriend of Bulma and the lifelong best friend of Puar.\n" +
                "\n" +
                "A former desert bandit, Yamcha was once an enemy of Goku, but quickly reformed and became a friend and ally. Brave, boastful and dependable, Yamcha is a very talented martial artist and one of the most powerful humans on Earth, possessing skills and traits that allow him to fight alongside his fellow Z Fighters when major threats loom. Although he retired by the latter half of Dragon Ball Z, due to being largely outclassed by both his allies (namely the Saiyans) and their enemies, he is always present whenever a new threat approaches, and will occasionally lend a helping hand, thus proving himself to be a powerful ally in his own right."
    )

    private val llReferences = arrayOf(
        "https://dragonball.fandom.com/wiki/Goku",
        "https://dragonball.fandom.com/wiki/Gohan",
        "https://dragonball.fandom.com/wiki/Goten",
        "https://dragonball.fandom.com/wiki/Vegeta",
        "https://dragonball.fandom.com/wiki/Future_Trunks",
        "https://dragonball.fandom.com/wiki/Piccolo",
        "https://dragonball.fandom.com/wiki/Master_Roshi",
        "https://dragonball.fandom.com/wiki/Tien_Shinhan",
        "https://dragonball.fandom.com/wiki/Krillin",
        "https://dragonball.fandom.com/wiki/Yamcha"
    )

    val listData: ArrayList<DragonBall>
        get() {
            val list = arrayListOf<DragonBall>()
            for (position in llNames.indices) {
                val data = DragonBall()
                data.name = llNames[position]
                data.photo = llPhoto[position]
                data.thumbnail = llThumb[position]
                data.race = llRace[position]
                data.height = llHeight[position]
                data.weight = llWeight[position]
                data.technique = llTechnique[position]
                data.transfromation = llTransformation[position]
                data.description = llDescription[position]
                data.references = llReferences[position]
                list.add(data)
            }
            return list
        }
}
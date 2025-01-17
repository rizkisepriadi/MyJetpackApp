import com.app.myjetpackapp.R
import com.app.myjetpackapp.model.DragonBall
import com.app.myjetpackapp.model.FighterZ

object DragonBallData {
    private val llIds = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) // ID unik untuk setiap karakter

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
        "Kamehameha",
        "Masenko",
        "Kamehameha",
        "Final Flash",
        "Burning Attack",
        "Makanposappo",
        "Kamehameha",
        "Tri-Beam",
        "Destructo Disk",
        "Spirit Ball"
    )

    private val llTransformation = arrayOf(
        "Super Saiyan",
        "Ultimate Gohan",
        "Super Saiyan",
        "Super Saiyan",
        "Super Saiyan",
        "Great Namekian",
        "None",
        "None",
        "None",
        "None"
    )

    private val llDescription = arrayOf(
        "Son Goku is the main protagonist of the Dragon Ball series. Born as Kakarot on Planet Vegeta, he was sent to Earth as a baby and raised by Grandpa Gohan. Goku is known for his cheerful personality, insatiable appetite, and love for fighting strong opponents. As a Saiyan, his abilities improve after every battle, and his transformation into Super Saiyan made him legendary across the universe. Despite his immense power, he values friendship, family, and justice above all else.",
        "Son Gohan, the first son of Goku and Chi-Chi, possesses incredible potential that even surpasses his father’s. Though initially timid and reluctant to fight, Gohan's true strength is unleashed in moments of desperation, such as during the Cell Games. As a scholar and a warrior, Gohan balances his intellectual pursuits with his duties to protect Earth. His transformation into Ultimate Gohan showcases his peak power.",
        "Son Goten, the youngest son of Goku, is a cheerful and playful child who idolizes his father and older brother, Gohan. Despite his young age, Goten shows remarkable combat abilities, achieving the Super Saiyan form with ease. Alongside his best friend Trunks, Goten enjoys mischievous adventures and training to become a strong fighter like his father.",
        "Vegeta, the Prince of Saiyans, starts as Goku’s greatest rival but gradually becomes one of Earth’s most powerful defenders. His pride and determination drive him to continuously surpass his limits, striving to outdo Goku at every turn. Despite his harsh exterior, Vegeta shows a softer side as a family man, devoted to Bulma and their children. His transformation into Super Saiyan Blue demonstrates his unyielding willpower.",
        "Future Trunks, the son of Vegeta and Bulma from an alternate timeline, is a courageous warrior who travels to the past to prevent a devastating future. With a strong sense of duty and justice, Trunks wields his sword with precision and unleashes powerful attacks like Burning Attack. His Super Saiyan transformation represents his determination to protect his loved ones.",
        "Piccolo is a Namekian warrior and the reincarnation of the demon King Piccolo. Initially an enemy of Goku, he becomes one of Earth’s most loyal defenders and a mentor to Gohan. Piccolo’s wisdom, strategy, and unique techniques like the Special Beam Cannon make him a formidable fighter. His ability to fuse with other Namekians further enhances his strength.",
        "Master Roshi, also known as the Turtle Hermit, is a legendary martial arts master who trained Goku, Krillin, and many others. Despite his advanced age and humorous antics, Roshi remains a powerful fighter, capable of unleashing devastating techniques like the Kamehameha. As a mentor, he values hard work, discipline, and the spirit of martial arts.",
        "Tenshinhan, often referred to as Tien, is a disciplined and honorable martial artist with three eyes. As a former student of the Crane School, Tien broke away from his villainous roots to become one of Earth’s defenders. His signature techniques, such as the Tri-Beam and Solar Flare, showcase his precision and mastery in combat.",
        "Krillin, Goku’s best friend and a skilled martial artist, is known for his courage and loyalty despite being a human among Saiyans and aliens. As a Z-Fighter, Krillin provides both comic relief and moments of heroism, using techniques like the Destructo Disk to hold his own in battles. He is also a devoted husband to Android 18 and a loving father to their daughter, Marron.",
        "Yamcha, a former desert bandit turned ally of Goku, is a charming and laid-back martial artist. Although he often struggles to keep up with the Saiyans, Yamcha contributes to the team with his unique Spirit Ball technique and unwavering loyalty. He remains a fan favorite for his relatable personality and comedic moments."
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

    val listData: ArrayList<FighterZ>
        get() {
            val list = arrayListOf<FighterZ>()
            for (position in llNames.indices) {
                val data = FighterZ(
                    id = llIds[position],
                    name = llNames[position],
                    photo = llPhoto[position],
                    thumbnail = llThumb[position],
                    race = llRace[position],
                    height = llHeight[position],
                    weight = llWeight[position],
                    technique = llTechnique[position],
                    transformation = llTransformation[position],
                    description = llDescription[position],
                    references = llReferences[position]
                )
                list.add(data)
            }
            return list
        }
}

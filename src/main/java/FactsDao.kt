

import org.eclipse.jetty.server.Authentication.User
import java.util.*
import kotlin.collections.RandomAccess
import kotlin.random.Random


class FactsDao {

    val facts = hashMapOf(
            0 to Facts(0, "Kralj Tomislav prvi je hrvatski kralj. Okrunjen je 925. godine"),
            1 to Facts(1, "Hrvati su se doselili na jadransku obalu oko sedmog stoljeća i smjestili se na ruševinama Rimskog Carstva"),
            2 to Facts(2, "Popularna HBO serija Igra prijestolja snimljena je u hrvatskim gradovima Split i Dubrovnik"),
            3 to Facts(3, "Dubrovačke gradske zidine čine najutvrđeniji sustav u Europi"),
            4 to Facts(4, "Pulski amfiteatar jedan je od tri očuvana u svijetu. Također je šesti najveći amfiteatar koji postoji"),
            5 to Facts(5, "Vlasnik Guinessovog rekorda za najveći bijeli tartuf na svijetu je Hrvat. Tartuf težine 1,31 kilogram pronašao je Giancarlo Zigante iz Pototoške 2. listopada 1999. u blizini Buja u Istri"),
            6 to Facts(6, "Španjolska i Hrvatska imaju najveći broj nematerijalnih dobara pod zaštitom UNESCO-a, uključujući pašku čipku, pravljenje medenjaka i rezbarenje drvenih igračaka"),
            7 to Facts(7, "Žene s otoka Suska poznate su kao jedine u Europi čija je narodna nošnja iznad koljena"),
            8 to Facts(8, "Prema popisu iz 2011., Hrvatska ima 4,29 milijuna stanovnika"),
            9 to Facts(9, "U Krapini je profesor Dragutin Gorjanović Kramberger otkrio najbogatiju kolekciju ostataka neandertalskog čovjeka na jednom mjestu"),
            10 to Facts(10, "Muzej krapinskih neanadertalaca proteže se na površini od oko 1.200 kvdratnih metara i jedan je od najmodernijih muzeja u Hrvatskoj i centralnoj Europi"),
            11 to Facts(11, "U Zadru se nalaze morske orgulje, koje sviraju pod utjecajem morskih valova"),
            12 to Facts(12, "Na karti Mjeseca nalaze se imena dvojice hrvatskih znanstvenika: Ruđera Boškovića i Andrije Mohorovičića"),
            13 to Facts(13, "Ivan Lupis Vukić u 19. je stoljeću u Rijeci napravio prvi torpedo"),
            14 to Facts(14, "Većina Hrvata su katolici."),
            15 to Facts(15, "Hrvatska ima 1246 otoka, otočića i uvala, a samo 48 ih je naseljeno"),
            16 to Facts(16, "Hrvatski nacionalni cvijet je perunika"),
            17 to Facts(17, "Posljednji preostali europski bjeloglavi supovi nalaze se na hrvatskom otoku Cresu"),
            18 to Facts(18, "Bjeloglavi supovi na Cresu jedini su na svijetu koji se gnijezde uz more"),
            19 to Facts(19, "Vino se u Hrvatskoj proizvodi već dvije i pol tisuće godina zahvaljujući utjecaju Grka"),
            20 to Facts(20, "Hrvatska ima više od 300 vinorodnih područja"),
            21 to Facts(21, "U Dubrovniku je 1296. izgrađen jedan od prvih srednjovjekovnih kanalizacijskih sustava, a u uporabi je i danas"),
            22 to Facts(22, "Čovječja ribica ime je dobila zbog boje kože"),
            23 to Facts(23, "Gotovo deset posto Hrvatske čini 11 parkova prirode, osam nacionalnih parkova i dva rezervata prirode"),
            24 to Facts(24, "Od devetog stoljeća Hrvati su koristili vlastito pismo: glagoljicu. Do 18. stoljeća koristila se usporedno s latinicom"),
            25 to Facts(25, "Najveći hrvatski otok je Krk, površine 462 kilometra kvadratna"),
            26 to Facts(26, "Hrvat Faust Vrančić izumitelj je prve turbine na vjetar."),
            27 to Facts(27, "Riječki karneval najveći je karneval u Hrvatskoj te jedan od najpopularnijih u Europi"),
            28 to Facts(28, "Posljednji primjerak sredozemne medvjedice živi u hrvatskom akvatoriju"),
            29 to Facts(29, "Hrvatske kovanice zovu se ‘lipe’, a ime su dobile po drvetu lipi. Kuna je podijeljena na 100 lipa"),
            30 to Facts(30, "Trećina Hrvatske prekrivena je šumom"),
            31 to Facts(31, "Glavni grad Hrvatske je Zagreb, a prvi glavni grad bio je Nin    "),
            32 to Facts(32, "Engleski pjesnik Lord Byron Dubrovnik je prozvao “biserom Jadrana”. Još uvijek nosi taj naziv"),
            33 to Facts(33, "Najviši hrvatski vrh nalazi se na 1.831 metar nadmorske visine"),
            34 to Facts(34, " Nakon Drugog svjetskog rata, Jugoslavija je postala samostalna federativna republika"),
            35 to Facts(35, "Hrvatska je po veličini 127. zemlja svijeta"),
            36 to Facts(36, " Hrvatska ima jedno od najkvalitetnijih vodu za piće u Europi"),
            37 to Facts(37, "Hrvatska ima sedam spomenika pod zaštitom UNESCO-a")

    )

    fun findById(id: Int): Facts? {
        return facts[id]
    }

    fun random():Facts?{

        var rnd = (0..37).random()
        return facts[rnd]

    }

}
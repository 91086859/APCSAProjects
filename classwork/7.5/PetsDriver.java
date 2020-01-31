import java.util.ArrayList;

public class PetsDriver
{
    public static void main(String[] args)
    {
        Dog bruh = new Dog("The history of all hitherto existing societies is the history\n" +
                "of class struggles.\n" +
                "\n" +
                "Freeman and slave, patrician and plebeian, lord and serf,\n" +
                "guild-master and journeyman, in a word, oppressor and oppressed,\n" +
                "stood in constant opposition to one another, carried on an\n" +
                "uninterrupted, now hidden, now open fight, a fight that each time\n" +
                "ended, either in a revolutionary re-constitution of society at\n" +
                "large, or in the common ruin of the contending classes.\n" +
                "\n" +
                "In the earlier epochs of history, we find almost everywhere a\n" +
                "complicated arrangement of society into various orders, a\n" +
                "manifold gradation of social rank.  In ancient Rome we have\n" +
                "patricians, knights, plebeians, slaves; in the Middle Ages,\n" +
                "feudal lords, vassals, guild-masters, journeymen, apprentices,\n" +
                "serfs; in almost all of these classes, again, subordinate\n" +
                "gradations.\n" +
                "\n" +
                "The modern bourgeois society that has sprouted from the ruins\n" +
                "of feudal society has not done away with class antagonisms.  It\n" +
                "has but established new classes, new conditions of oppression,\n" +
                "new forms of struggle in place of the old ones.  Our epoch, the\n" +
                "epoch of the bourgeoisie, possesses, however, this distinctive\n" +
                "feature: it has simplified the class antagonisms. Society as a\n" +
                "whole is more and more splitting up into two great hostile camps,\n" +
                "into two great classes, directly facing each other: Bourgeoisie\n" +
                "and Proletariat.\n" +
                "\n" +
                "From the serfs of the Middle Ages sprang the chartered burghers\n" +
                "of the earliest towns.  From these burgesses the first elements\n" +
                "of the bourgeoisie were developed.\n" +
                "\n" +
                "The discovery of America, the rounding of the Cape, opened up\n" +
                "fresh ground for the rising bourgeoisie. The East-Indian and\n" +
                "Chinese markets, the colonisation of America, trade with\n" +
                "the colonies, the increase in the means of exchange and in\n" +
                "commodities generally, gave to commerce, to navigation, to\n" +
                "industry, an impulse never before known, and thereby, to the\n" +
                "revolutionary element in the tottering feudal society, a rapid\n" +
                "development.\n" +
                "\n" +
                "The feudal system of industry, under which industrial production\n" +
                "was monopolised by closed guilds, now no longer sufficed for the\n" +
                "growing wants of the new markets.  The manufacturing system took\n" +
                "its place.  The guild-masters were pushed on one side by the\n" +
                "manufacturing middle class; division of labour between the\n" +
                "different corporate guilds vanished in the face of division of\n" +
                "labour in each single workshop.\n" +
                "\n" +
                "Meantime the markets kept ever growing, the demand ever rising.\n" +
                "Even manufacture no longer sufficed.  Thereupon, steam and\n" +
                "machinery revolutionised industrial production.  The place of\n" +
                "manufacture was taken by the giant, Modern Industry, the place of\n" +
                "the industrial middle class, by industrial millionaires, the\n" +
                "leaders of whole industrial armies, the modern bourgeois.\n" +
                "\n" +
                "Modern industry has established the world-market, for which the\n" +
                "discovery of America paved the way.  This market has given an\n" +
                "immense development to commerce, to navigation, to communication\n" +
                "by land.  This development has, in its time, reacted on the\n" +
                "extension of industry; and in proportion as industry, commerce,\n" +
                "navigation, railways extended, in the same proportion the\n" +
                "bourgeoisie developed, increased its capital, and pushed into the\n" +
                "background  every class handed down from the Middle Ages.\n" +
                "\n" +
                "We see, therefore, how the modern bourgeoisie is itself the\n" +
                "product of a long course of development, of a series of\n" +
                "revolutions in the modes of production and of exchange.\n" +
                "\n" +
                "Each step in the development of the bourgeoisie was accompanied\n" +
                "by a corresponding political advance of that class.  An\n" +
                "oppressed class under the sway of the feudal nobility, an\n" +
                "armed and self-governing association in the mediaeval commune;\n" +
                "here independent urban republic (as in Italy and Germany),\n" +
                "there taxable \"third estate\" of the monarchy (as in France),\n" +
                "afterwards, in the  period of manufacture proper, serving either\n" +
                "the semi-feudal or the absolute monarchy as a counterpoise\n" +
                "against the nobility, and, in fact, corner-stone of the great\n" +
                "monarchies in general, the bourgeoisie has at last, since the\n" +
                "establishment of Modern Industry and of the world-market,\n" +
                "conquered for itself, in the modern representative State,\n" +
                "exclusive political sway.  The executive of the modern State is\n" +
                "but a committee for managing the common affairs of the whole\n" +
                "bourgeoisie.\n" +
                "\n" +
                "The bourgeoisie, historically, has played a most revolutionary\n" +
                "part.\n" +
                "\n" +
                "The bourgeoisie, wherever it has got the upper hand, has put an\n" +
                "end to all feudal, patriarchal, idyllic relations.  It has\n" +
                "pitilessly torn asunder the motley feudal ties that bound man to\n" +
                "his \"natural superiors,\" and has left remaining no other nexus\n" +
                "between man and man than naked self-interest, than callous \"cash\n" +
                "payment.\"  It has drowned the most heavenly ecstasies of\n" +
                "religious fervour, of chivalrous enthusiasm, of philistine\n" +
                "sentimentalism, in the icy water of egotistical calculation.  It\n" +
                "has resolved personal worth into exchange value, and in place of\n" +
                "the numberless and indefeasible chartered freedoms, has set up that\n" +
                "single, unconscionable freedom--Free Trade.  In one word, for\n" +
                "exploitation, veiled by religious and political illusions, naked,\n" +
                "shameless, direct, brutal exploitation.\n" +
                "\n" +
                "The bourgeoisie has stripped of its halo every occupation\n" +
                "hitherto honoured and looked up to with reverent awe.  It has\n" +
                "converted the physician, the lawyer, the priest, the poet, the\n" +
                "man of science, into its paid wage labourers.\n" +
                "\n" +
                "The bourgeoisie has torn away from the family its sentimental\n" +
                "veil, and has reduced the family relation to a mere money\n" +
                "relation.\n" +
                "\n" +
                "The bourgeoisie has disclosed how it came to pass that the\n" +
                "brutal display of vigour in the Middle Ages, which Reactionists\n" +
                "so much admire, found its fitting complement in the most slothful\n" +
                "indolence.  It has been the first to show what man's activity can\n" +
                "bring about.  It has accomplished wonders far surpassing Egyptian\n" +
                "pyramids, Roman aqueducts, and Gothic cathedrals; it has\n" +
                "conducted expeditions that put in the shade all former Exoduses\n" +
                "of nations and crusades.\n" +
                "\n" +
                "The bourgeoisie cannot exist without constantly revolutionising\n" +
                "the instruments of production, and thereby the relations of\n" +
                "production, and with them the whole relations of society.\n" +
                "Conservation of the old modes of production in unaltered form,\n" +
                "was, on the contrary, the first condition of existence for all\n" +
                "earlier industrial classes. Constant revolutionising of\n" +
                "production, uninterrupted disturbance of all social conditions,\n" +
                "everlasting uncertainty and agitation distinguish the bourgeois\n" +
                "epoch from all earlier ones. All fixed, fast-frozen relations,\n" +
                "with their train of ancient and venerable prejudices and\n" +
                "opinions, are swept away, all new-formed ones become antiquated\n" +
                "before they can ossify. All that is solid melts into air, all\n" +
                "that is holy is profaned, and man is at last compelled to face\n" +
                "with sober senses, his real conditions of life, and his\n" +
                "relations with his kind.\n" +
                "\n" +
                "The need of a constantly expanding market for its products\n" +
                "chases the bourgeoisie over the whole surface of the globe. It\n" +
                "must nestle everywhere, settle everywhere, establish connexions\n" +
                "everywhere.\n" +
                "\n" +
                "The bourgeoisie has through its exploitation of the world-market\n" +
                "given a cosmopolitan character to production and consumption in\n" +
                "every country.  To the great chagrin of Reactionists, it has\n" +
                "drawn from under the feet of industry the national ground on\n" +
                "which it stood.  All old-established national industries have\n" +
                "been destroyed or are daily being destroyed.  They are dislodged\n" +
                "by new industries, whose introduction becomes a life and death\n" +
                "question for all civilised nations, by industries that no longer\n" +
                "work up indigenous raw material, but raw material drawn from the\n" +
                "remotest zones; industries whose products are consumed, not only\n" +
                "at home, but in every quarter of the globe.  In place of the old\n" +
                "wants, satisfied by the productions of the country, we find new\n" +
                "wants, requiring for their satisfaction the products of distant\n" +
                "lands and climes.  In place of the old local and national\n" +
                "seclusion and self-sufficiency, we have intercourse in every\n" +
                "direction, universal inter-dependence of nations.  And as in\n" +
                "material, so also in intellectual production.  The intellectual\n" +
                "creations of individual nations become common property.  National\n" +
                "one-sidedness and narrow-mindedness become more and more\n" +
                "impossible, and from the numerous national and local literatures,\n" +
                "there arises a world literature.\n" +
                "\n" +
                "The bourgeoisie, by the rapid improvement of all instruments of\n" +
                "production, by the immensely facilitated means of communication,\n" +
                "draws all, even the most barbarian, nations into civilisation.\n" +
                "The cheap prices of its commodities are the heavy artillery with\n" +
                "which it batters down all Chinese walls, with which it forces the\n" +
                "barbarians' intensely obstinate hatred of foreigners to\n" +
                "capitulate.  It compels all nations, on pain of extinction, to\n" +
                "adopt the bourgeois mode of production; it compels them to\n" +
                "introduce what it calls civilisation into their midst, i.e., to\n" +
                "become bourgeois themselves.  In one word, it creates a world\n" +
                "after its own image.\n" +
                "\n" +
                "The bourgeoisie has subjected the country to the rule of the\n" +
                "towns.  It has created enormous cities, has greatly increased the\n" +
                "urban population as compared with the rural, and has thus rescued\n" +
                "a considerable part of the population from the idiocy of rural\n" +
                "life.  Just as it has made the country dependent on the towns, so\n" +
                "it has made barbarian and semi-barbarian countries dependent on\n" +
                "the civilised ones, nations of peasants on nations of bourgeois,\n" +
                "the East on the West.\n" +
                "\n" +
                "The bourgeoisie keeps more and more doing away with the\n" +
                "scattered state of the population, of the means of production,\n" +
                "and of property.  It has agglomerated production, and has\n" +
                "concentrated property in a few hands.  The necessary consequence\n" +
                "of this was political centralisation.  Independent, or but\n" +
                "loosely connected provinces, with separate interests, laws,\n" +
                "governments and systems of taxation, became lumped together into\n" +
                "one nation, with one government, one code of laws, one national\n" +
                "class-interest, one frontier and one customs-tariff.  The\n" +
                "bourgeoisie, during its rule of scarce one hundred years, has\n" +
                "created more massive and more colossal productive forces than\n" +
                "have all preceding generations together.  Subjection of Nature's\n" +
                "forces to man, machinery, application of chemistry to industry\n" +
                "and agriculture, steam-navigation, railways, electric telegraphs,\n" +
                "clearing of whole continents for cultivation, canalisation of\n" +
                "rivers, whole populations conjured out of the ground--what\n" +
                "earlier century had even a presentiment that such productive\n" +
                "forces slumbered in the lap of social labour?\n" +
                "\n" +
                "We see then: the means of production and of exchange, on whose\n" +
                "foundation the bourgeoisie built itself up, were generated in\n" +
                "feudal society.  At a certain stage in the development of these\n" +
                "means of production and of exchange, the conditions under which\n" +
                "feudal society produced and exchanged, the feudal organisation of\n" +
                "agriculture and manufacturing industry, in one word, the feudal\n" +
                "relations of property became no longer compatible with the\n" +
                "already developed productive forces; they became so many fetters.\n" +
                "They had to be burst asunder; they were burst asunder.\n" +
                "\n" +
                "Into their place stepped free competition, accompanied by a\n" +
                "social and political constitution adapted to it, and by the\n" +
                "economical and political sway of the bourgeois class.\n" +
                "\n" +
                "A similar movement is going on before our own eyes.  Modern\n" +
                "bourgeois society with its relations of production, of exchange\n" +
                "and of property, a society that has conjured up such gigantic\n" +
                "means of production and of exchange, is like the sorcerer, who is\n" +
                "no longer able to control the powers of the nether world whom he\n" +
                "has called up by his spells.  For many a decade past the history\n" +
                "of industry and commerce is but the history of the revolt of\n" +
                "modern productive forces against modern conditions of production,\n" +
                "against the property relations that are the conditions for the\n" +
                "existence of the bourgeoisie and of its rule.  It is enough to\n" +
                "mention the commercial crises that by their periodical return put\n" +
                "on its trial, each time more threateningly, the existence of the\n" +
                "entire bourgeois society.  In these crises a great part not only\n" +
                "of the existing products, but also of the previously created\n" +
                "productive forces, are periodically destroyed.  In these crises\n" +
                "there breaks out an epidemic that, in all earlier epochs, would\n" +
                "have seemed an absurdity--the epidemic of over-production.\n" +
                "Society suddenly finds itself put back into a state of momentary\n" +
                "barbarism; it appears as if a famine, a universal war of\n" +
                "devastation had cut off the supply of every means of subsistence;\n" +
                "industry and commerce seem to be destroyed; and why?  Because\n" +
                "there is too much civilisation, too much means of subsistence,\n" +
                "too much industry, too much commerce.  The productive forces at\n" +
                "the disposal of society no longer tend to further the development\n" +
                "of the conditions of bourgeois property; on the contrary, they\n" +
                "have become too powerful for these conditions, by which they are\n" +
                "fettered, and so soon as they overcome these fetters, they bring\n" +
                "disorder into the whole of bourgeois society, endanger the\n" +
                "existence of bourgeois property.  The conditions of bourgeois\n" +
                "society are too narrow to comprise the wealth created by them.\n" +
                "And how does the bourgeoisie get over these crises?  On the one\n" +
                "hand inforced destruction of a mass of productive forces; on the\n" +
                "other, by the conquest of new markets, and by the more thorough\n" +
                "exploitation of the old ones.  That is to say, by paving the\n" +
                "way for more extensive and more destructive crises, and by\n" +
                "diminishing the means whereby crises are prevented.\n" +
                "\n" +
                "The weapons with which the bourgeoisie felled feudalism to the\n" +
                "ground are now turned against the bourgeoisie itself.\n" +
                "\n" +
                "But not only has the bourgeoisie forged the weapons that bring\n" +
                "death to itself; it has also called into existence the men who\n" +
                "are to wield those weapons--the modern working class--the\n" +
                "proletarians.\n" +
                "\n" +
                "In proportion as the bourgeoisie, i.e., capital, is developed,\n" +
                "in the same proportion is the proletariat, the modern working\n" +
                "class, developed--a class of labourers, who live only so long\n" +
                "as they find work, and who find work only so long as their labour\n" +
                "increases capital.  These labourers, who must sell themselves\n" +
                "piece-meal, are a commodity, like every other article of\n" +
                "commerce, and are consequently exposed to all the vicissitudes of\n" +
                "competition, to all the fluctuations of the market.\n" +
                "\n" +
                "Owing to the extensive use of machinery and to division of\n" +
                "labour, the work of the proletarians has lost all individual\n" +
                "character, and consequently, all charm for the workman.  He\n" +
                "becomes an appendage of the machine, and it is only the most\n" +
                "simple, most monotonous, and most easily acquired knack, that is\n" +
                "required of him.  Hence, the cost of production of a workman is\n" +
                "restricted, almost entirely, to the means of subsistence that he\n" +
                "requires for his maintenance, and for the propagation of his\n" +
                "race.  But the price of a commodity, and therefore also of\n" +
                "labour, is equal to its cost of production.  In proportion\n" +
                "therefore, as the repulsiveness of the work increases, the wage\n" +
                "decreases.  Nay more, in proportion as the use of machinery and\n" +
                "division of labour increases, in the same proportion the burden\n" +
                "of toil also increases, whether by prolongation of the working\n" +
                "hours, by increase of the work exacted in a given time or by\n" +
                "increased speed of the machinery, etc.\n" +
                "\n" +
                "Modern industry has converted the little workshop of the\n" +
                "patriarchal master into the great factory of the industrial\n" +
                "capitalist.  Masses of labourers, crowded into the factory, are\n" +
                "organised like soldiers.  As privates of the industrial army they\n" +
                "are placed under the command of a perfect hierarchy of officers\n" +
                "and sergeants.  Not only are they slaves of the bourgeois class,\n" +
                "and of the bourgeois State; they are daily and hourly enslaved by\n" +
                "the machine, by the over-looker, and, above all, by the\n" +
                "individual bourgeois manufacturer himself.  The more openly this\n" +
                "despotism proclaims gain to be its end and aim, the more petty,\n" +
                "the more hateful and the more embittering it is.\n" +
                "\n" +
                "The less the skill and exertion of strength implied in manual\n" +
                "labour, in other words, the more modern industry becomes\n" +
                "developed, the more is the labour of men superseded by that of\n" +
                "women. Differences of age and sex have no longer any distinctive\n" +
                "social validity for the working class. All are instruments of\n" +
                "labour, more or less expensive to use, according to their age\n" +
                "and sex.\n" +
                "\n" +
                "No sooner is the exploitation of the labourer by the manufacturer,\n" +
                "so far at an end, that he receives his wages in cash, than he is\n" +
                "set upon by the other portions of the bourgeoisie, the landlord,\n" +
                "the shopkeeper, the pawnbroker, etc.\n" +
                "\n" +
                "The lower strata of the middle class--the small tradespeople,\n" +
                "shopkeepers, retired tradesmen generally, the handicraftsmen and\n" +
                "peasants--all these sink gradually into the proletariat, partly\n" +
                "because their diminutive capital does not suffice for the scale\n" +
                "on which Modern Industry is carried on, and is swamped in the\n" +
                "competition with the large capitalists, partly because their\n" +
                "specialized skill is rendered worthless by the new methods of\n" +
                "production.  Thus the proletariat is recruited from all classes\n" +
                "of the population.\n" +
                "\n" +
                "The proletariat goes through various stages of development.\n" +
                "With its birth begins its struggle with the bourgeoisie.  At\n" +
                "first the contest is carried on by individual labourers, then by\n" +
                "the workpeople of a factory, then by the operatives of one trade,\n" +
                "in one locality, against the individual bourgeois who directly\n" +
                "exploits them.  They direct their attacks not against the\n" +
                "bourgeois conditions of production, but against the instruments\n" +
                "of production themselves; they destroy imported wares that\n" +
                "compete with their labour, they smash to pieces machinery, they\n" +
                "set factories ablaze, they seek to restore by force the vanished\n" +
                "status of the workman of the Middle Ages.\n" +
                "\n" +
                "At this stage the labourers still form an incoherent mass\n" +
                "scattered over the whole country, and broken up by their mutual\n" +
                "competition.  If anywhere they unite to form more compact bodies,\n" +
                "this is not yet the consequence of their own active union, but of\n" +
                "the union of the bourgeoisie, which class, in order to attain its\n" +
                "own political ends, is compelled to set the whole proletariat in\n" +
                "motion, and is moreover yet, for a time, able to do so.  At this\n" +
                "stage, therefore, the proletarians do not fight their enemies,\n" +
                "but the enemies of their enemies, the remnants of absolute\n" +
                "monarchy, the landowners, the non-industrial bourgeois, the petty\n" +
                "bourgeoisie.  Thus the whole historical movement is concentrated\n" +
                "in the hands of the bourgeoisie; every victory so obtained is a\n" +
                "victory for the bourgeoisie.\n" +
                "\n" +
                "But with the development of industry the proletariat not only\n" +
                "increases in number; it becomes concentrated in greater masses,\n" +
                "its strength grows, and it feels that strength more.  The various\n" +
                "interests and conditions of life within the ranks of the\n" +
                "proletariat are more and more equalised, in proportion as\n" +
                "machinery obliterates all distinctions of labour, and nearly\n" +
                "everywhere reduces wages to the same low level.  The growing\n" +
                "competition among the bourgeois, and the resulting commercial\n" +
                "crises, make the wages of the workers ever more fluctuating.  The\n" +
                "unceasing improvement of machinery, ever more rapidly developing,\n" +
                "makes their livelihood more and more precarious; the collisions\n" +
                "between individual workmen and individual bourgeois take more and\n" +
                "more the character of collisions between two classes.  Thereupon\n" +
                "the workers begin to form combinations (Trades Unions) against\n" +
                "the bourgeois; they club together in order to keep up the rate of\n" +
                "wages; they found permanent associations in order to make\n" +
                "provision beforehand for these occasional revolts.  Here and\n" +
                "there the contest breaks out into riots.\n" +
                "\n" +
                "Now and then the workers are victorious, but only for a time.\n" +
                "The real fruit of their battles lies, not in the immediate\n" +
                "result, but in the ever-expanding union of the workers.  This\n" +
                "union is helped on by the improved means of communication that\n" +
                "are created by modern industry and that place the workers of\n" +
                "different localities in contact with one another.  It was just\n" +
                "this contact that was needed to centralise the numerous local\n" +
                "struggles, all of the same character, into one national struggle\n" +
                "between classes.  But every class struggle is a political\n" +
                "struggle.  And that union, to attain which the burghers of the\n" +
                "Middle Ages, with their miserable highways, required centuries,\n" +
                "the modern proletarians, thanks to railways, achieve in a few\n" +
                "years.\n" +
                "\n" +
                "This organisation of the proletarians into a class, and\n" +
                "consequently into a political party, is continually being upset\n" +
                "again by the competition between the workers themselves.  But it\n" +
                "ever rises up again, stronger, firmer, mightier.  It compels\n" +
                "legislative recognition of particular interests of the workers,\n" +
                "by taking advantage of the divisions among the bourgeoisie\n" +
                "itself.  Thus the ten-hours' bill in England was carried.\n" +
                "\n" +
                "Altogether collisions between the classes of the old society\n" +
                "further, in many ways, the course of development of the\n" +
                "proletariat. The bourgeoisie finds itself involved in a constant\n" +
                "battle. At first with the aristocracy; later on, with those\n" +
                "portions of the bourgeoisie itself, whose interests have become\n" +
                "antagonistic to the progress of industry; at all times, with the\n" +
                "bourgeoisie of foreign countries. In all these battles it sees\n" +
                "itself compelled to appeal to the proletariat, to ask for its\n" +
                "help, and thus, to drag it into the political arena. The\n" +
                "bourgeoisie itself, therefore, supplies the proletariat with its\n" +
                "own instruments of political and general education, in other\n" +
                "words, it furnishes the proletariat with weapons for fighting\n" +
                "the bourgeoisie.\n" +
                "\n" +
                "Further, as we have already seen, entire sections of the ruling\n" +
                "classes are, by the advance of industry, precipitated into the\n" +
                "proletariat, or are at least threatened in their conditions of\n" +
                "existence.  These also supply the proletariat with fresh elements\n" +
                "of enlightenment and progress.\n" +
                "\n" +
                "Finally, in times when the class struggle nears the decisive\n" +
                "hour, the process of dissolution going on within the ruling\n" +
                "class, in fact within the whole range of society, assumes such a\n" +
                "violent, glaring character, that a small section of the ruling\n" +
                "class cuts itself adrift, and joins the revolutionary class, the\n" +
                "class that holds the future in its hands.  Just as, therefore, at\n" +
                "an earlier period, a section of the nobility went over to the\n" +
                "bourgeoisie, so now a portion of the bourgeoisie goes over to the\n" +
                "proletariat, and in particular, a portion of the bourgeois\n" +
                "ideologists, who have raised themselves to the level of\n" +
                "comprehending theoretically the historical movement as a whole.\n" +
                "\n" +
                "Of all the classes that stand face to face with the bourgeoisie\n" +
                "today, the proletariat alone is a really revolutionary class.\n" +
                "The other classes decay and finally disappear in the face of\n" +
                "Modern Industry; the proletariat is its special and essential\n" +
                "product.  The lower middle class, the small manufacturer, the\n" +
                "shopkeeper, the artisan, the peasant, all these fight against the\n" +
                "bourgeoisie, to save from extinction their existence as fractions\n" +
                "of the middle class.  They are therefore not revolutionary, but\n" +
                "conservative.  Nay more, they are reactionary, for they try\n" +
                "to roll back the wheel of history.  If by chance they are\n" +
                "revolutionary, they are so only in view of their impending\n" +
                "transfer into the proletariat, they thus defend not their\n" +
                "present, but their future interests, they desert their own\n" +
                "standpoint to place themselves at that of the proletariat.\n" +
                "\n" +
                "The \"dangerous class,\" the social scum, that passively rotting\n" +
                "mass thrown off by the lowest layers of old society, may,\n" +
                "here and there, be swept into the movement by a proletarian\n" +
                "revolution; its conditions of life, however, prepare it far more\n" +
                "for the part of a bribed tool of reactionary intrigue.\n" +
                "\n" +
                "In the conditions of the proletariat, those of old society at\n" +
                "large are already virtually swamped.  The proletarian is without\n" +
                "property; his relation to his wife and children has no longer\n" +
                "anything in common with the bourgeois family-relations; modern\n" +
                "industrial labour, modern subjection to capital, the same in\n" +
                "England as in France, in America as in Germany, has stripped him\n" +
                "of every trace of national character.  Law, morality, religion,\n" +
                "are to him so many bourgeois prejudices, behind which lurk in\n" +
                "ambush just as many bourgeois interests.\n" +
                "\n" +
                "All the preceding classes that got the upper hand, sought to\n" +
                "fortify their already acquired status by subjecting society at\n" +
                "large to their conditions of appropriation.  The proletarians\n" +
                "cannot become masters of the productive forces of society, except\n" +
                "by abolishing their own previous mode of appropriation, and\n" +
                "thereby also every other previous mode of appropriation.  They\n" +
                "have nothing of their own to secure and to fortify; their mission\n" +
                "is to destroy all previous securities for, and insurances of,\n" +
                "individual property.\n" +
                "\n" +
                "All previous historical movements were movements of minorities,\n" +
                "or in the interests of minorities.  The proletarian movement is\n" +
                "the self-conscious, independent movement of the immense majority,\n" +
                "in the interests of the immense majority.  The proletariat, the\n" +
                "lowest stratum of our present society, cannot stir, cannot raise\n" +
                "itself up, without the whole superincumbent strata of official\n" +
                "society being sprung into the air.\n" +
                "\n" +
                "Though not in substance, yet in form, the struggle of the\n" +
                "proletariat with the bourgeoisie is at first a national struggle.\n" +
                "The proletariat of each country must, of course, first of all\n" +
                "settle matters with its own bourgeoisie.\n" +
                "\n" +
                "In depicting the most general phases of the development of the\n" +
                "proletariat, we traced the more or less veiled civil war, raging\n" +
                "within existing society, up to the point where that war breaks\n" +
                "out into open revolution, and where the violent overthrow of the\n" +
                "bourgeoisie lays the foundation for the sway of the proletariat.\n" +
                "\n" +
                "Hitherto, every form of society has been based, as we have\n" +
                "already seen, on the antagonism of oppressing and oppressed\n" +
                "classes.  But in order to oppress a class, certain conditions\n" +
                "must be assured to it under which it can, at least, continue its\n" +
                "slavish existence.  The serf, in the period of serfdom, raised\n" +
                "himself to membership in the commune, just as the petty\n" +
                "bourgeois, under the yoke of feudal absolutism, managed to\n" +
                "develop into a bourgeois.  The modern laborer, on the contrary,\n" +
                "instead of rising with the progress of industry, sinks deeper and\n" +
                "deeper below the conditions of existence of his own class.  He\n" +
                "becomes a pauper, and pauperism develops more rapidly than\n" +
                "population and wealth.  And here it becomes evident, that the\n" +
                "bourgeoisie is unfit any longer to be the ruling class in\n" +
                "society, and to impose its conditions of existence upon society\n" +
                "as an over-riding law.  It is unfit to rule because it is\n" +
                "incompetent to assure an existence to its slave within his\n" +
                "slavery, because it cannot help letting him sink into such a\n" +
                "state, that it has to feed him, instead of being fed by him.\n" +
                "Society can no longer live under this bourgeoisie, in other\n" +
                "words, its existence is no longer compatible with society.\n" +
                "\n" +
                "The essential condition for the existence, and for the sway of\n" +
                "the bourgeois class, is the formation and augmentation of\n" +
                "capital; the condition for capital is wage-labour.  Wage-labour\n" +
                "rests exclusively on competition between the laborers.  The\n" +
                "advance of industry, whose involuntary promoter is the bourgeoisie,\n" +
                "replaces the isolation of the labourers, due to competition,\n" +
                "by their revolutionary combination, due to association.  The\n" +
                "development of Modern Industry, therefore, cuts from under its\n" +
                "feet the very foundation on which the bourgeoisie produces and\n" +
                "appropriates products.  What the bourgeoisie, therefore, produces,\n" +
                "above all, is its own grave-diggers.  Its fall and the victory of\n" +
                "the proletariat are equally inevitable.", "Marxist", false, 392, 20193, "Potato");
        Pet zuckerberg = new Lizard("German-Austria must return to the great German mo- \n" +
                "therland, and not because of economic considerations of \n" +
                "any sort. No, no: even if from the economic point of view \n" +
                "this union were unimportant, indeed, if it were harmful, it \n" +
                "ought nevertheless to be brought about. Common blood be- \n" +
                "longs in a common Reich. As long as the German nation is \n" +
                "unable even to band together its own children in one com- \n" +
                "mon State, it has no moral right to think of colonization as \n" +
                "one of its political aims. Only when the boundaries of the \n" +
                "Reich include even the last German, only when it is no \n" +
                "longer possible to assure him of daily bread inside them, \n" +
                "does there arise, out of the distress of the nation, the moral \n" +
                "right to acquire foreign soil and territory. The sword is \n" +
                "then the plow, and from the tears of war there grows the \n" +
                "daily bread for generations to come. Therefore, this little \n" +
                "town on the border appears to me the symbol of a great \n" +
                "task. But in another respect also it looms up as a warning to our present time.", "Facebook CEO", true, 5, 1000, "Hamburger");
        Pet declaration = new BlueFootedBooby("The unanimous Declaration of the thirteen united States of America, When in the Course of human events, it becomes necessary for one people to dissolve the political bands which have connected them with another, and to assume among the powers of the earth, the separate and equal station to which the Laws of Nature and of Nature's God entitle them, a decent respect to the opinions of mankind requires that they should declare the causes which impel them to the separation.\n" +
                "\n" +
                "We hold these truths to be self-evident, that all men are created equal, that they are endowed by their Creator with certain unalienable Rights, that among these are Life, Liberty and the pursuit of Happiness.--That to secure these rights, Governments are instituted among Men, deriving their just powers from the consent of the governed, --That whenever any Form of Government becomes destructive of these ends, it is the Right of the People to alter or to abolish it, and to institute new Government, laying its foundation on such principles and organizing its powers in such form, as to them shall seem most likely to effect their Safety and Happiness. Prudence, indeed, will dictate that Governments long established should not be changed for light and transient causes; and accordingly all experience hath shewn, that mankind are more disposed to suffer, while evils are sufferable, than to right themselves by abolishing the forms to which they are accustomed. But when a long train of abuses and usurpations, pursuing invariably the same Object evinces a design to reduce them under absolute Despotism, it is their right, it is their duty, to throw off such Government, and to provide new Guards for their future security.--Such has been the patient sufferance of these Colonies; and such is now the necessity which constrains them to alter their former Systems of Government. The history of the present King of Great Britain is a history of repeated injuries and usurpations, all having in direct object the establishment of an absolute Tyranny over these States. To prove this, let Facts be submitted to a candid world.\n" +
                "\n" +
                "He has refused his Assent to Laws, the most wholesome and necessary for the public good.\n" +
                "\n" +
                "He has forbidden his Governors to pass Laws of immediate and pressing importance, unless suspended in their operation till his Assent should be obtained; and when so suspended, he has utterly neglected to attend to them.\n" +
                "\n" +
                "He has refused to pass other Laws for the accommodation of large districts of people, unless those people would relinquish the right of Representation in the Legislature, a right inestimable to them and formidable to tyrants only.\n" +
                "\n" +
                "He has called together legislative bodies at places unusual, uncomfortable, and distant from the depository of their public Records, for the sole purpose of fatiguing them into compliance with his measures.\n" +
                "\n" +
                "He has dissolved Representative Houses repeatedly, for opposing with manly firmness his invasions on the rights of the people.\n" +
                "\n" +
                "He has refused for a long time, after such dissolutions, to cause others to be elected; whereby the Legislative powers, incapable of Annihilation, have returned to the People at large for their exercise; the State remaining in the mean time exposed to all the dangers of invasion from without, and convulsions within.\n" +
                "\n" +
                "He has endeavoured to prevent the population of these States; for that purpose obstructing the Laws for Naturalization of Foreigners; refusing to pass others to encourage their migrations hither, and raising the conditions of new Appropriations of Lands.\n" +
                "\n" +
                "He has obstructed the Administration of Justice, by refusing his Assent to Laws for establishing Judiciary powers.\n" +
                "\n" +
                "He has made Judges dependent on his Will alone, for the tenure of their offices, and the amount and payment of their salaries.\n" +
                "\n" +
                "He has erected a multitude of New Offices, and sent hither swarms of Officers to harrass our people, and eat out their substance.\n" +
                "\n" +
                "He has kept among us, in times of peace, Standing Armies without the Consent of our legislatures.\n" +
                "\n" +
                "He has affected to render the Military independent of and superior to the Civil power.\n" +
                "\n" +
                "He has combined with others to subject us to a jurisdiction foreign to our constitution, and unacknowledged by our laws; giving his Assent to their Acts of pretended Legislation:\n" +
                "\n" +
                "For Quartering large bodies of armed troops among us:\n" +
                "\n" +
                "For protecting them, by a mock Trial, from punishment for any Murders which they should commit on the Inhabitants of these States:\n" +
                "\n" +
                "For cutting off our Trade with all parts of the world:\n" +
                "\n" +
                "For imposing Taxes on us without our Consent:\n" +
                "\n" +
                "For depriving us in many cases, of the benefits of Trial by Jury:\n" +
                "\n" +
                "For transporting us beyond Seas to be tried for pretended offences\n" +
                "\n" +
                "For abolishing the free System of English Laws in a neighbouring Province, establishing therein an Arbitrary government, and enlarging its Boundaries so as to render it at once an example and fit instrument for introducing the same absolute rule into these Colonies:\n" +
                "\n" +
                "For taking away our Charters, abolishing our most valuable Laws, and altering fundamentally the Forms of our Governments:\n" +
                "\n" +
                "For suspending our own Legislatures, and declaring themselves invested with power to legislate for us in all cases whatsoever.\n" +
                "\n" +
                "He has abdicated Government here, by declaring us out of his Protection and waging War against us.\n" +
                "\n" +
                "He has plundered our seas, ravaged our Coasts, burnt our towns, and destroyed the lives of our people.\n" +
                "\n" +
                "He is at this time transporting large Armies of foreign Mercenaries to compleat the works of death, desolation and tyranny, already begun with circumstances of Cruelty & perfidy scarcely paralleled in the most barbarous ages, and totally unworthy the Head of a civilized nation.\n" +
                "\n" +
                "He has constrained our fellow Citizens taken Captive on the high Seas to bear Arms against their Country, to become the executioners of their friends and Brethren, or to fall themselves by their Hands.\n" +
                "\n" +
                "He has excited domestic insurrections amongst us, and has endeavoured to bring on the inhabitants of our frontiers, the merciless Indian Savages, whose known rule of warfare, is an undistinguished destruction of all ages, sexes and conditions.\n" +
                "\n" +
                "In every stage of these Oppressions We have Petitioned for Redress in the most humble terms: Our repeated Petitions have been answered only by repeated injury. A Prince whose character is thus marked by every act which may define a Tyrant, is unfit to be the ruler of a free people.\n" +
                "\n" +
                "Nor have We been wanting in attentions to our Brittish brethren. We have warned them from time to time of attempts by their legislature to extend an unwarrantable jurisdiction over us. We have reminded them of the circumstances of our emigration and settlement here. We have appealed to their native justice and magnanimity, and we have conjured them by the ties of our common kindred to disavow these usurpations, which, would inevitably interrupt our connections and correspondence. They too have been deaf to the voice of justice and of consanguinity. We must, therefore, acquiesce in the necessity, which denounces our Separation, and hold them, as we hold the rest of mankind, Enemies in War, in Peace Friends.\n" +
                "\n" +
                "We, therefore, the Representatives of the united States of America, in General Congress, Assembled, appealing to the Supreme Judge of the world for the rectitude of our intentions, do, in the Name, and by Authority of the good People of these Colonies, solemnly publish and declare, That these United Colonies are, and of Right ought to be Free and Independent States; that they are Absolved from all Allegiance to the British Crown, and that all political connection between them and the State of Great Britain, is and ought to be totally dissolved; and that as Free and Independent States, they have full Power to levy War, conclude Peace, contract Alliances, establish Commerce, and to do all other Acts and Things which Independent States may of right do. And for the support of this Declaration, with a firm reliance on the protection of divine Providence, we mutually pledge to each other our Lives, our Fortunes and our sacred Honor.", true, 200000, 3, "Egg");

        System.out.println(bruh.fetch()); // only works when bruh is a Dog, NOT when bruh is a Pet.
        System.out.println(bruh.Speak()); // dependent upon what type bruh is, Dog vs Pet
        Pet[] zoo = new Pet[3];
        zoo[0] = bruh;
        zoo[1] = zuckerberg;
        zoo[2] = declaration;

        for(Pet yes : zoo)
        {
            System.out.println(yes);
        }
    }
}

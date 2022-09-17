package config.language;

// Emacs style mode select   -*- C++ -*- 
//-----------------------------------------------------------------------------
//
// $Id: englsh.java,v 1.5 2011/05/31 21:46:20 velktron Exp $
//
// Copyright (C) 1993-1996 by id Software, Inc.
//
// This program is free software; you can redistribute it and/or
// modify it under the terms of the GNU General Public License
// as published by the Free Software Foundation; either version 2
// of the License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// DESCRIPTION:
//  Printed strings for translation.
//  English language support (default).
//
//-----------------------------------------------------------------------------

//
//  Printed strings for translation
//

//
// D_Main.C
//

public class englsh{
public final static String  D_DEVSTR="Development mode ON.\n";
public final static String  D_CDROM="CD-ROM Version: default.cfg from c:\\doomdata\n";

//
// M_Misc.C
//

public final static String SCREENSHOT ="screen shot";

//
//  M_Menu.C
//
public final static String  PRESSKEY ="press a key.";
public final static String  PRESSYN ="press y or n.";
public final static String  QUITMSG="are you sure you want to\nquit this great game?";
public final static String  LOADNET ="you can't do load while in a net game!\n\n"+PRESSKEY;
public final static String  QLOADNET="you can't quickload during a netgame!\n\n"+PRESSKEY;
public final static String  QSAVESPOT="you haven't picked a quicksave slot yet!\n\n"+PRESSKEY;
public final static String  SAVEDEAD ="you can't save if you aren't playing!\n\n"+PRESSKEY;
public final static String  QSPROMPT ="quicksave over your game named\n\n'%s'?\n\n"+PRESSYN;
public final static String  QLPROMPT="do you want to quickload the game named\n\n'%s'?\n\n"+PRESSYN;

public final static String  NEWGAME = "you can't start a new game\nwhile in a network game.\n\n"+PRESSKEY;

public final static String  NIGHTMARE ="are you sure? this skill level\nisn't even remotely fair.\n\n"+PRESSYN;

public final static String  SWSTRING = "this is the shareware version of doom.\n\nyou need to order the entire trilogy.\n\n"+PRESSKEY;

public final static String  MSGOFF="Messages OFF";
public final static String  MSGON   ="Messages ON";
public final static String  NETEND="you can't end a netgame!\n\n"+PRESSKEY;
public final static String  ENDGAME="are you sure you want to end the game?\n\n"+PRESSYN;

public final static String  DOSY    ="(press y to quit)";

public final static String  DETAILHI="High detail";
public final static String  DETAILLO="Low detail";
public final static String  GAMMALVL0="Gamma correction OFF";
public final static String  GAMMALVL1="Gamma correction level 1";
public final static String  GAMMALVL2="Gamma correction level 2";
public final static String  GAMMALVL3="Gamma correction level 3";
public final static String  GAMMALVL4="Gamma correction level 4";
public final static String  EMPTYSTRING="empty slot";

//
//  G_game.C
//
public final static String  GGSAVED="game saved.";

//
//  HU_stuff.C
//
public final static String  HUSTR_MSGU="[Message unsent]";

public final static String  HUSTR_CHATMACRO1="I'm ready to kick butt!";
public final static String  HUSTR_CHATMACRO2="I'm OK.";
public final static String  HUSTR_CHATMACRO3="I'm not looking too good!";
public final static String  HUSTR_CHATMACRO4="Help!";
public final static String  HUSTR_CHATMACRO5="You suck!";
public final static String  HUSTR_CHATMACRO6="Next time, scumbag...";
public final static String  HUSTR_CHATMACRO7="Come here!";
public final static String  HUSTR_CHATMACRO8="I'll take care of it.";
public final static String  HUSTR_CHATMACRO9="Yes";
public final static String  HUSTR_CHATMACRO0="No";

public final static String  HUSTR_TALKTOSELF1="You mumble to yourself";
public final static String  HUSTR_TALKTOSELF2="Who's there?";
public final static String  HUSTR_TALKTOSELF3="You scare yourself";
public final static String  HUSTR_TALKTOSELF4="You start to rave";
public final static String  HUSTR_TALKTOSELF5="You've lost it...";

public final static String  HUSTR_MESSAGESENT="[Message Sent]";

// The following should NOT be changed unless it seems
// just AWFULLY necessary

public final static String  HUSTR_PLRGREEN="Green: ";
public final static String  HUSTR_PLRINDIGO="Indigo: ";
public final static String  HUSTR_PLRBROWN="Brown: ";
public final static String  HUSTR_PLRRED    ="Red: ";

public final static char  HUSTR_KEYGREEN = 'g';
public final static char  HUSTR_KEYINDIGO ='i';
public final static char  HUSTR_KEYBROWN = 'b';
public final static char  HUSTR_KEYRED   = 'r';

//
//  AM_map.C
//

public final static String  AMSTR_FOLLOWON="Follow Mode ON";
public final static String  AMSTR_FOLLOWOFF="Follow Mode OFF";

public final static String  AMSTR_GRIDON="Grid ON";
public final static String  AMSTR_GRIDOFF="Grid OFF";

public final static String  AMSTR_MARKEDSPOT="Marked Spot";
public final static String  AMSTR_MARKSCLEARED="All Marks Cleared";

//
//  ST_stuff.C
//

public final static String  STSTR_MUS   ="Music Change";
public final static String  STSTR_NOMUS ="IMPOSSIBLE SELECTION";
public final static String  STSTR_DQDON ="Degreelessness Mode On";
public final static String  STSTR_DQDOFF="Degreelessness Mode Off";

public final static String  STSTR_KFAADDED="Very Happy Ammo Added";
public final static String  STSTR_FAADDED="Ammo (no keys) Added";

public final static String  STSTR_NCON  ="No Clipping Mode ON";
public final static String  STSTR_NCOFF ="No Clipping Mode OFF";

public final static String  STSTR_BEHOLD="inVuln, Str, Inviso, Rad, Allmap, or Lite-amp";
public final static String  STSTR_BEHOLDX="Power-up Toggled";

public final static String  STSTR_CHOPPERS="... doesn't suck - GM";
public final static String  STSTR_CLEV  ="Changing Level...";

//
//  F_Finale.C
//
public final static String  E1TEXT =(
"Once you beat the big badasses and\n"+
"clean out the moon base you're supposed\n"+
"to win, aren't you? Aren't you? Where's\n"+
"your fat reward and ticket home? What\n"+
"the hell is this? It's not supposed to\n"+
"end this way!\n"+
"\n" +
"It stinks like rotten meat, but looks\n"+
"like the lost Deimos base.  Looks like\n"+
"you're stuck on The Shores of Hell.\n"+
"The only way out is through.\n"+
"\n"+
"To continue the DOOM experience, play\n"+
"The Shores of Hell and its amazing\n"+
"sequel, Inferno!\n");


public final static String  E2TEXT =(
"You've done it! The hideous cyber-\n"+
"demon lord that ruled the lost Deimos\n"+
"moon base has been slain and you\n"+
"are triumphant! But ... where are\n"+
"you? You clamber to the edge of the\n"+
"moon and look down to see the awful\n"+
"truth.\n" +
"\n"+
"Deimos floats above Hell itself!\n"+
"You've never heard of anyone escaping\n"+
"from Hell, but you'll make the bastards\n"+
"sorry they ever heard of you! Quickly,\n"+
"you rappel down to  the surface of\n"+
"Hell.\n"+
"\n" +
"Now, it's on to the final chapter of\n"+
"DOOM! -- Inferno.");


public final static String  E3TEXT =(
"The loathsome spiderdemon that\n"+
"masterminded the invasion of the moon\n"+
"bases and caused so much death has had\n"+
"its ass kicked for all time.\n"+
"\n"+
"A hidden doorway opens and you enter.\n"+
"You've proven too tough for Hell to\n"+
"contain, and now Hell at last plays\n"+
"fair -- for you emerge from the door\n"+
"to see the green fields of Earth!\n"+
"Home at last.\n" +
"\n"+
"You wonder what's been happening on\n"+
"Earth while you were battling evil\n"+
"unleashed. It's good that no Hell-\n"+
"spawn could have come through that\n"+
"door with you ...");


public final static String  E4TEXT =(
"the spider mastermind must have sent forth\n"+
"its legions of hellspawn before your\n"+
"final confrontation with that terrible\n"+
"beast from hell.  but you stepped forward\n"+
"and brought forth eternal damnation and\n"+
"suffering upon the horde as a true hero\n"+
"would in the face of something so evil.\n"+
"\n"+
"besides, someone was gonna pay for what\n"+
"happened to daisy, your pet rabbit.\n"+
"\n"+
"but now, you see spread before you more\n"+
"potential pain and gibbitude as a nation\n"+
"of demons run amok among our cities.\n"+
"\n"+
"next stop, hell on earth!");


// after level 6, put this:

public final static String  C1TEXT =(
"YOU HAVE ENTERED DEEPLY INTO THE INFESTED\n" +
"STARPORT. BUT SOMETHING IS WRONG. THE\n" +
"MONSTERS HAVE BROUGHT THEIR OWN REALITY\n" +
"WITH THEM, AND THE STARPORT'S TECHNOLOGY\n" +
"IS BEING SUBVERTED BY THEIR PRESENCE.\n" +
"\n"+
"AHEAD, YOU SEE AN OUTPOST OF HELL, A\n" +
"FORTIFIED ZONE. IF YOU CAN GET PAST IT,\n" +
"YOU CAN PENETRATE INTO THE HAUNTED HEART\n" +
"OF THE STARBASE AND FIND THE CONTROLLING\n" +
"SWITCH WHICH HOLDS EARTH'S POPULATION\n" +
"HOSTAGE.");

// After level 11, put this:

public final static String  C2TEXT =(
"YOU HAVE WON! YOUR VICTORY HAS ENABLED\n" +
"HUMANKIND TO EVACUATE EARTH AND ESCAPE\n"+
"THE NIGHTMARE.  NOW YOU ARE THE ONLY\n"+
"HUMAN LEFT ON THE FACE OF THE PLANET.\n"+
"CANNIBAL MUTATIONS, CARNIVOROUS ALIENS,\n"+
"AND EVIL SPIRITS ARE YOUR ONLY NEIGHBORS.\n"+
"YOU SIT BACK AND WAIT FOR DEATH, CONTENT\n"+
"THAT YOU HAVE SAVED YOUR SPECIES.\n"+
"\n"+
"BUT THEN, EARTH CONTROL BEAMS DOWN A\n"+
"MESSAGE FROM SPACE: \"SENSORS HAVE LOCATED\n"+
"THE SOURCE OF THE ALIEN INVASION. IF YOU\n"+
"GO THERE, YOU MAY BE ABLE TO BLOCK THEIR\n"+
"ENTRY.  THE ALIEN BASE IS IN THE HEART OF\n"+
"YOUR OWN HOME CITY, NOT FAR FROM THE\n"+
"STARPORT.\" SLOWLY AND PAINFULLY YOU GET\n"+
"UP AND RETURN TO THE FRAY.");


// After level 20, put this:

public final static String  C3TEXT =(
"YOU ARE AT THE CORRUPT HEART OF THE CITY,\n"+
"SURROUNDED BY THE CORPSES OF YOUR ENEMIES.\n"+
"YOU SEE NO WAY TO DESTROY THE CREATURES'\n"+
"ENTRYWAY ON THIS SIDE, SO YOU CLENCH YOUR\n"+
"TEETH AND PLUNGE THROUGH IT.\n"+
"\n"+
"THERE MUST BE A WAY TO CLOSE IT ON THE\n"+
"OTHER SIDE. WHAT DO YOU CARE IF YOU'VE\n"+
"GOT TO GO THROUGH HELL TO GET TO IT?");


// After level 30, put this:

public final static String  C4TEXT =(
"THE HORRENDOUS VISAGE OF THE BIGGEST\n"+
"DEMON YOU'VE EVER SEEN CRUMBLES BEFORE\n"+
"YOU, AFTER YOU PUMP YOUR ROCKETS INTO\n"+
"HIS EXPOSED BRAIN. THE MONSTER SHRIVELS\n"+
"UP AND DIES, ITS THRASHING LIMBS\n"+
"DEVASTATING UNTOLD MILES OF HELL'S\n"+
"SURFACE.\n"+
"\n"+
"YOU'VE DONE IT. THE INVASION IS OVER.\n"+
"EARTH IS SAVED. HELL IS A WRECK. YOU\n"+
"WONDER WHERE BAD FOLKS WILL GO WHEN THEY\n"+
"DIE, NOW. WIPING THE SWEAT FROM YOUR\n"+
"FOREHEAD YOU BEGIN THE LONG TREK BACK\n"+
"HOME. REBUILDING EARTH OUGHT TO BE A\n"+
"LOT MORE FUN THAN RUINING IT WAS.\n");



// Before level 31, put this:

public final static String  C5TEXT =(
"CONGRATULATIONS, YOU'VE FOUND THE SECRET\n"+
"LEVEL! LOOKS LIKE IT'S BEEN BUILT BY\n"+
"HUMANS, RATHER THAN DEMONS. YOU WONDER\n"+
"WHO THE INMATES OF THIS CORNER OF HELL\n"+
"WILL BE.");


// Before level 32, put this:

public final static String  C6TEXT =(
"CONGRATULATIONS, YOU'VE FOUND THE\n"+
"SUPER SECRET LEVEL!  YOU'D BETTER\n"+
"BLAZE THROUGH THIS ONE!\n");


// after map 06 

public final static String  P1TEXT  =(
"You gloat over the steaming carcass of the\n"+
"Guardian.  With its death, you've wrested\n"+
"the Accelerator from the stinking claws\n"+
"of Hell.  You relax and glance around the\n"+
"room.  Damn!  There was supposed to be at\n"+
"least one working prototype, but you can't\n"+
"see it. The demons must have taken it.\n"+
"\n"+
"You must find the prototype, or all your\n"+
"struggles will have been wasted. Keep\n"+
"moving, keep fighting, keep killing.\n"+
"Oh yes, keep living, too.");


// after map 11

public final static String  P2TEXT =(
"Even the deadly Arch-Vile labyrinth could\n"+
"not stop you, and you've gotten to the\n"+
"prototype Accelerator which is soon\n"+
"efficiently and permanently deactivated.\n"+
"\n"+
"You're good at that kind of thing.");


// after map 20

public final static String  P3TEXT =(
"You've bashed and battered your way into\n"+
"the heart of the devil-hive.  Time for a\n"+
"Search-and-Destroy mission, aimed at the\n"+
"Gatekeeper, whose foul offspring is\n"+
"cascading to Earth.  Yeah, he's bad. But\n"+
"you know who's worse!\n"+
"\n"+
"Grinning evilly, you check your gear, and\n"+
"get ready to give the bastard a little Hell\n"+
"of your own making!");

// after map 30

public final static String  P4TEXT =(
"The Gatekeeper's evil face is splattered\n"+
"all over the place.  As its tattered corpse\n"+
"collapses, an inverted Gate forms and\n"+
"sucks down the shards of the last\n"+
"prototype Accelerator, not to mention the\n"+
"few remaining demons.  You're done. Hell\n"+
"has gone back to pounding bad dead folks \n"+
"instead of good live ones.  Remember to\n"+
"tell your grandkids to put a rocket\n"+
"launcher in your coffin. If you go to Hell\n"+
"when you die, you'll need it for some\n"+
"final cleaning-up ...");

// before map 31

public final static String  P5TEXT =(
"You've found the second-hardest level we\n"+
"got. Hope you have a saved game a level or\n"+
"two previous.  If not, be prepared to die\n"+
"aplenty. For master marines only.");

// before map 32

public final static String  P6TEXT =(
"Betcha wondered just what WAS the hardest\n"+
"level we had ready for ya?  Now you know.\n"+
"No one gets out alive.");


public final static String  T1TEXT =(
"You've fought your way out of the infested\n"+
"experimental labs.   It seems that UAC has\n"+
"once again gulped it down.  With their\n"+
"high turnover, it must be hard for poor\n"+
"old UAC to buy corporate health insurance\n"+
"nowadays..\n"+
"\n"+
"Ahead lies the military complex, now\n"+
"swarming with diseased horrors hot to get\n"+
"their teeth into you. With luck, the\n"+
"complex still has some warlike ordnance\n"+
"laying around.");


public final static String  T2TEXT =(
"You hear the grinding of heavy machinery\n"+
"ahead.  You sure hope they're not stamping\n"+
"out new hellspawn, but you're ready to\n"+
"ream out a whole herd if you have to.\n"+
"They might be planning a blood feast, but\n"+
"you feel about as mean as two thousand\n"+
"maniacs packed into one mad killer.\n"+
"\n"+
"You don't plan to go down easy.");


public final static String  T3TEXT =(
"The vista opening ahead looks real damn\n"+
"familiar. Smells familiar, too -- like\n"+
"fried excrement. You didn't like this\n"+
"place before, and you sure as hell ain't\n"+
"planning to like it now. The more you\n"+
"brood on it, the madder you get.\n"+
"Hefting your gun, an evil grin trickles\n"+
"onto your face. Time to take some names.");

public final static String  T4TEXT =(
"Suddenly, all is silent, from one horizon\n"+
"to the other. The agonizing echo of Hell\n"+
"fades away, the nightmare sky turns to\n"+
"blue, the heaps of monster corpses start \n"+
"to evaporate along with the evil stench \n"+
"that filled the air. Jeeze, maybe you've\n"+
"done it. Have you really won?\n"+
"\n"+
"Something rumbles in the distance.\n"+
"A blue light begins to glow inside the\n"+
"ruined skull of the demon-spitter.");


public final static String  T5TEXT =(
"What now? Looks totally different. Kind\n"+
"of like King Tut's condo. Well,\n"+
"whatever's here can't be any worse\n"+
"than usual. Can it?  Or maybe it's best\n"+
"to let sleeping gods lie..");


public final static String  T6TEXT =(
"Time for a vacation. You've burst the\n"+
"bowels of hell and by golly you're ready\n"+
"for a break. You mutter to yourself,\n"+
"Maybe someone else can kick Hell's ass\n"+
"next time around. Ahead lies a quiet town,\n"+
"with peaceful flowing water, quaint\n"+
"buildings, and presumably no Hellspawn.\n"+
"\n"+
"As you step off the transport, you hear\n"+
"the stomp of a cyberdemon's iron shoe.");



//
// Character cast strings F_FINALE.C
//
public final static String  CC_ZOMBIE="ZOMBIEMAN";
public final static String  CC_SHOTGUN="SHOTGUN GUY";
public final static String  CC_HEAVY="HEAVY WEAPON DUDE";
public final static String  CC_IMP="IMP";
public final static String  CC_DEMON="DEMON";
public final static String  CC_LOST="LOST SOUL";
public final static String  CC_CACO="CACODEMON";
public final static String  CC_HELL="HELL KNIGHT";
public final static String  CC_BARON="BARON OF HELL";
public final static String  CC_ARACH="ARACHNOTRON";
public final static String  CC_PAIN="PAIN ELEMENTAL";
public final static String  CC_REVEN="REVENANT";
public final static String  CC_MANCU="MANCUBUS";
public final static String  CC_ARCH="ARCH-VILE";
public final static String  CC_SPIDER="THE SPIDER MASTERMIND";
public final static String  CC_CYBER="THE CYBERDEMON";
public final static String  CC_NAZI="WAFFEN SS. SIEG HEIL!";
public final static String  CC_KEEN="COMMANDER KEEN";
public final static String  CC_BARREL="EXPLODING BARREL";
public final static String  CC_HERO="OUR HERO";

}
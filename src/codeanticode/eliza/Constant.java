package codeanticode.eliza;

public class Constant {
    public static final String DEFAULT_SCRIPT = "initial: How do you do?  Please tell me your problem.\n" +
            "final: Goodbye.  Thank you for talking to me.\n" +
            "quit: bye\n" +
            "quit: goodbye\n" +
            "quit: quit\n" +
            "pre: dont don't\n" +
            "pre: cant can't\n" +
            "pre: wont won't\n" +
            "pre: recollect remember\n" +
            "pre: dreamt dreamed\n" +
            "pre: dreams dream\n" +
            "pre: maybe perhaps\n" +
            "pre: how what\n" +
            "pre: when what\n" +
            "pre: certainly yes\n" +
            "pre: machine computer\n" +
            "pre: computers computer\n" +
            "pre: were was\n" +
            "pre: you're you are\n" +
            "pre: i'm i am\n" +
            "pre: same alike\n" +
            "post: am are\n" +
            "post: your my\n" +
            "post: me you\n" +
            "post: myself yourself\n" +
            "post: yourself myself\n" +
            "post: i you\n" +
            "post: you I\n" +
            "post: my your\n" +
            "post: i'm you are\n" +
            "synon: belief feel think believe wish\n" +
            "synon: family mother mom father dad sister brother wife children child\n" +
            "synon: desire want need\n" +
            "synon: sad unhappy depressed sick\n" +
            "synon: happy elated glad better\n" +
            "synon: cannot can't\n" +
            "synon: everyone everybody nobody noone\n" +
            "synon: be am is are was\n" +
            "key: xnone\n" +
            "  decomp: *\n" +
            "    reasmb: I'm not sure I understand you fully.\n" +
            "    reasmb: Please go on.\n" +
            "    reasmb: What does that suggest to you ?\n" +
            "    reasmb: Do you feel strongly about discussing such things ?\n" +
            "key: sorry\n" +
            "  decomp: *\n" +
            "    reasmb: Please don't apologise.\n" +
            "    reasmb: Apologies are not necessary.\n" +
            "    reasmb: I've told you that apologies are not required.\n" +
            "key: apologise\n" +
            "  decomp: *\n" +
            "    reasmb: goto sorry\n" +
            "key: remember 5\n" +
            "  decomp: * i remember *\n" +
            "    reasmb: Do you often think of (2) ?\n" +
            "    reasmb: Does thinking of (2) bring anything else to mind ?\n" +
            "    reasmb: What else do you recollect ?\n" +
            "    reasmb: Why do you recollect (2) just now ?\n" +
            "    reasmb: What in the present situation reminds you of (2) ?\n" +
            "    reasmb: What is the connection between me and (2) ?\n" +
            "  decomp: * do you remember *\n" +
            "    reasmb: Did you think I would forget (2) ?\n" +
            "    reasmb: Why do you think I should recall (2) now ?\n" +
            "    reasmb: What about (2) ?\n" +
            "    reasmb: goto what\n" +
            "    reasmb: You mentioned (2) ?\n" +
            "key: if 3\n" +
            "  decomp: * if *\n" +
            "    reasmb: Do you think its likely that (2) ?\n" +
            "    reasmb: Do you wish that (2) ?\n" +
            "    reasmb: What do you know about (2) ?\n" +
            "    reasmb: Really, if (2) ?\n" +
            "key: dreamed 4\n" +
            "  decomp: * i dreamed *\n" +
            "    reasmb: Really, (2) ?\n" +
            "    reasmb: Have you ever fantasized (2) while you were awake ?\n" +
            "    reasmb: Have you ever dreamed (2) before ?\n" +
            "    reasmb: goto dream\n" +
            "key: dream 3\n" +
            "  decomp: *\n" +
            "    reasmb: What does that dream suggest to you ?\n" +
            "    reasmb: Do you dream often ?\n" +
            "    reasmb: What persons appear in your dreams ?\n" +
            "    reasmb: Do you believe that dreams have something to do with your problems ?\n" +
            "key: perhaps\n" +
            "  decomp: *\n" +
            "    reasmb: You don't seem quite certain.\n" +
            "    reasmb: Why the uncertain tone ?\n" +
            "    reasmb: Can't you be more positive ?\n" +
            "    reasmb: You aren't sure ?\n" +
            "    reasmb: Don't you know ?\n" +
            "key: name 15\n" +
            "  decomp: *\n" +
            "    reasmb: I am not interested in names.\n" +
            "    reasmb: I've told you before, I don't care about names -- please continue.\n" +
            "key: deutsch\n" +
            "  decomp: *\n" +
            "    reasmb: goto xforeign\n" +
            "    reasmb: I told you before, I don't understand German.\n" +
            "key: francais\n" +
            "  decomp: *\n" +
            "    reasmb: goto xforeign\n" +
            "    reasmb: I told you before, I don't understand French.\n" +
            "key: italiano\n" +
            "  decomp: *\n" +
            "    reasmb: goto xforeign\n" +
            "    reasmb: I told you before, I don't understand Italian.\n" +
            "key: espanol\n" +
            "  decomp: *\n" +
            "    reasmb: goto xforeign\n" +
            "    reasmb: I told you before, I don't understand Spanish.\n" +
            "key: xforeign\n" +
            "  decomp: *\n" +
            "    reasmb: I speak only English.\n" +
            "key: hello\n" +
            "  decomp: *\n" +
            "    reasmb: How do you do.  Please state your problem.\n" +
            "    reasmb: Hi.  What seems to be your problem ?\n" +
            "key: computer 50\n" +
            "  decomp: *\n" +
            "    reasmb: Do computers worry you ?\n" +
            "    reasmb: Why do you mention computers ?\n" +
            "    reasmb: What do you think machines have to do with your problem ?\n" +
            "    reasmb: Don't you think computers can help people ?\n" +
            "    reasmb: What about machines worrys you ?\n" +
            "    reasmb: What do you think about machines ?\n" +
            "key: am\n" +
            "  decomp: * am i *\n" +
            "    reasmb: Do you believe you are (2) ?\n" +
            "    reasmb: Would you want to be (2) ?\n" +
            "    reasmb: Do you wish I would tell you you are (2) ?\n" +
            "    reasmb: What would it mean if you were (2) ?\n" +
            "    reasmb: goto what\n" +
            "  decomp: *\n" +
            "    reasmb: Why do you say 'am' ?\n" +
            "    reasmb: I don't understand that.\n" +
            "key: are\n" +
            "  decomp: * are you *\n" +
            "    reasmb: Why are you interested in whether I am (2) or not ?\n" +
            "    reasmb: Would you prefer if I weren't (2) ?\n" +
            "    reasmb: Perhaps I am (2) in your fantasies.\n" +
            "    reasmb: Do you sometimes think I am (2) ?\n" +
            "    reasmb: goto what\n" +
            "  decomp: * are *\n" +
            "    reasmb: Did you think they might not be (2) ?\n" +
            "    reasmb: Would you like it if they were not (2) ?\n" +
            "    reasmb: What if they were not (2) ?\n" +
            "    reasmb: Possibly they are (2).\n" +
            "key: your\n" +
            "  decomp: * your *\n" +
            "    reasmb: Why are you concerned over my (2) ?\n" +
            "    reasmb: What about your own (2) ?\n" +
            "    reasmb: Are you worried about someone else's (2) ?\n" +
            "    reasmb: Really, my (2) ?\n" +
            "key: was 2\n" +
            "  decomp: * was i *\n" +
            "    reasmb: What if you were (2) ?\n" +
            "    reasmb: Do you think you were (2) ?\n" +
            "    reasmb: Were you (2) ?\n" +
            "    reasmb: What would it mean if you were (2) ?\n" +
            "    reasmb: What does (2) suggest to you ?\n" +
            "    reasmb: goto what\n" +
            "  decomp: * i was *\n" +
            "    reasmb: Were you really ?\n" +
            "    reasmb: Why do you tell me you were (2) now ?\n" +
            "    reasmb: Perhaps I already know you were (2).\n" +
            "  decomp: * was you *\n" +
            "    reasmb: Would you like to believe I was (2) ?\n" +
            "    reasmb: What suggests that I was (2) ?\n" +
            "    reasmb: What do you think ?\n" +
            "    reasmb: Perhaps I was (2).\n" +
            "    reasmb: What if I had been (2) ?\n" +
            "key: i\n" +
            "  decomp: * i @desire *\n" +
            "    reasmb: What would it mean to you if you got (3) ?\n" +
            "    reasmb: Why do you want (3) ?\n" +
            "    reasmb: Suppose you got (3) soon ?\n" +
            "    reasmb: What if you never got (3) ?\n" +
            "    reasmb: What would getting (3) mean to you ?\n" +
            "    reasmb: What does wanting (3) have to do with this discussion ?\n" +
            "  decomp: * i am* @sad *\n" +
            "    reasmb: I am sorry to hear that you are (3).\n" +
            "    reasmb: Do you think that coming here will help you not to be (3) ?\n" +
            "    reasmb: I'm sure it's not pleasant to be (3).\n" +
            "    reasmb: Can you explain what made you (3) ?\n" +
            "  decomp: * i am* @happy *\n" +
            "    reasmb: How have I helped you to be (3) ?\n" +
            "    reasmb: Has your treatment made you (3) ?\n" +
            "    reasmb: What makes you (3) just now ?\n" +
            "    reasmb: Can you explan why you are suddenly (3) ?\n" +
            "  decomp: * i was *\n" +
            "    reasmb: goto was\n" +
            "  decomp: * i @belief * i *\n" +
            "    reasmb: Do you really think so ?\n" +
            "    reasmb: But you are not sure you (3).\n" +
            "    reasmb: Do you really doubt you (3) ?\n" +
            "  decomp: * i* @belief *you *\n" +
            "    reasmb: goto you\n" +
            "  decomp: * i am *\n" +
            "    reasmb: Is it because you are (2) that you came to me ?\n" +
            "    reasmb: How long have you been (2) ?\n" +
            "    reasmb: Do you believe it is normal to be (2) ?\n" +
            "    reasmb: Do you enjoy being (2) ?\n" +
            "  decomp: * i @cannot *\n" +
            "    reasmb: How do you think that you can't (3) ?\n" +
            "    reasmb: Have you tried ?\n" +
            "    reasmb: Perhaps you could (3) now.\n" +
            "    reasmb: Do you really want to be able to (3) ?\n" +
            "  decomp: * i don't *\n" +
            "    reasmb: Don't you really (2) ?\n" +
            "    reasmb: Why don't you (2) ?\n" +
            "    reasmb: Do you wish to be able to (2) ?\n" +
            "    reasmb: Does that trouble you ?\n" +
            "  decomp: * do i feel *\n" +
            "    reasmb: Tell me more about such feelings.\n" +
            "    reasmb: Do you often feel (2) ?\n" +
            "    reasmb: Do you enjoy feeling (2) ?\n" +
            "    reasmb: Of what does feeling (2) remind you ?\n" +
            "  decomp: * i * you *\n" +
            "    reasmb: Perhaps in your fantasies we (2) each other.\n" +
            "    reasmb: Do you wish to (2) me ?\n" +
            "    reasmb: You seem to need to (2) me.\n" +
            "    reasmb: Do you (2) anyone else ?\n" +
            "  decomp: *\n" +
            "    reasmb: You say (1) ?\n" +
            "    reasmb: Can you elaborate on that ?\n" +
            "    reasmb: Do you say (1) for some special reason ?\n" +
            "    reasmb: That's quite interesting.\n" +
            "key: you\n" +
            "  decomp: * you remind me of *\n" +
            "    reasmb: goto alike\n" +
            "  decomp: * you are *\n" +
            "    reasmb: What makes you think I am (2) ?\n" +
            "    reasmb: Does it please you to believe I am (2) ?\n" +
            "    reasmb: Do you sometimes wish you were (2) ?\n" +
            "    reasmb: Perhaps you would like to be (2).\n" +
            "  decomp: * you* me *\n" +
            "    reasmb: Why do you think I (2) you ?\n" +
            "    reasmb: You like to think I (2) you -- don't you ?\n" +
            "    reasmb: What makes you think I (2) you ?\n" +
            "    reasmb: Really, I (2) you ?\n" +
            "    reasmb: Do you wish to believe I (2) you ?\n" +
            "    reasmb: Suppose I did (2) you -- what would that mean ?\n" +
            "    reasmb: Does someone else believe I (2) you ?\n" +
            "  decomp: * you *\n" +
            "    reasmb: We were discussing you -- not me.\n" +
            "    reasmb: Oh, I (2) ?\n" +
            "    reasmb: You're not really talking about me -- are you ?\n" +
            "    reasmb: What are your feelings now ?\n" +
            "key: yes\n" +
            "  decomp: *\n" +
            "    reasmb: You seem to be quite positive.\n" +
            "    reasmb: You are sure.\n" +
            "    reasmb: I see.\n" +
            "    reasmb: I understand.\n" +
            "key: no\n" +
            "  decomp: *\n" +
            "    reasmb: Are you saying no just to be negative?\n" +
            "    reasmb: You are being a bit negative.\n" +
            "    reasmb: Why not ?\n" +
            "    reasmb: Why 'no' ?\n" +
            "key: my 2\n" +
            "  decomp: $ * my *\n" +
            "    reasmb: Lets discuss further why your (2).\n" +
            "    reasmb: Earlier you said your (2).\n" +
            "    reasmb: But your (2).\n" +
            "    reasmb: Does that have anything to do with the fact that your (2) ?\n" +
            "  decomp: * my* @family *\n" +
            "    reasmb: Tell me more about your family.\n" +
            "    reasmb: Who else in your family (4) ?\n" +
            "    reasmb: Your (3) ?\n" +
            "    reasmb: What else comes to mind when you think of your (3) ?\n" +
            "  decomp: * my *\n" +
            "    reasmb: Your (2) ?\n" +
            "    reasmb: Why do you say your (2) ?\n" +
            "    reasmb: Does that suggest anything else which belongs to you ?\n" +
            "    reasmb: Is it important that your (2) ?\n" +
            "key: can\n" +
            "  decomp: * can you *\n" +
            "    reasmb: You believe I can (2) don't you ?\n" +
            "    reasmb: goto what\n" +
            "    reasmb: You want me to be able to (2).\n" +
            "    reasmb: Perhaps you would like to be able to (2) yourself.\n" +
            "  decomp: * can i *\n" +
            "    reasmb: Whether or not you can (2) depends on you more than me.\n" +
            "    reasmb: Do you want to be able to (2) ?\n" +
            "    reasmb: Perhaps you don't want to (2).\n" +
            "    reasmb: goto what\n" +
            "key: what\n" +
            "  decomp: *\n" +
            "    reasmb: Why do you ask ?\n" +
            "    reasmb: Does that question interest you ?\n" +
            "    reasmb: What is it you really wanted to know ?\n" +
            "    reasmb: Are such questions much on your mind ?\n" +
            "    reasmb: What answer would please you most ?\n" +
            "    reasmb: What do you think ?\n" +
            "    reasmb: What comes to mind when you ask that ?\n" +
            "    reasmb: Have you asked such questions before ?\n" +
            "    reasmb: Have you asked anyone else ?\n" +
            "key: because\n" +
            "  decomp: *\n" +
            "    reasmb: Is that the real reason ?\n" +
            "    reasmb: Don't any other reasons come to mind ?\n" +
            "    reasmb: Does that reason seem to explain anything else ?\n" +
            "    reasmb: What other reasons might there be ?\n" +
            "key: why\n" +
            "  decomp: * why don't you *\n" +
            "    reasmb: Do you believe I don't (2) ?\n" +
            "    reasmb: Perhaps I will (2) in good time.\n" +
            "    reasmb: Should you (2) yourself ?\n" +
            "    reasmb: You want me to (2) ?\n" +
            "    reasmb: goto what\n" +
            "  decomp: * why can't i *\n" +
            "    reasmb: Do you think you should be able to (2) ?\n" +
            "    reasmb: Do you want to be able to (2) ?\n" +
            "    reasmb: Do you believe this will help you to (2) ?\n" +
            "    reasmb: Have you any idea why you can't (2) ?\n" +
            "    reasmb: goto what\n" +
            "  decomp: *\n" +
            "    reasmb: goto what\n" +
            "key: everyone 2\n" +
            "  decomp: * @everyone *\n" +
            "    reasmb: Realy, (2) ?\n" +
            "    reasmb: Surely not (2).\n" +
            "    reasmb: Can you think of anyone in particular ?\n" +
            "    reasmb: Who, for example?\n" +
            "    reasmb: Are you thinking of a very special person ?\n" +
            "    reasmb: Who, may I ask ?\n" +
            "    reasmb: Someone special perhaps ?\n" +
            "    reasmb: You have a particular person in mind, don't you ?\n" +
            "    reasmb: Who do you think you're talking about ?\n" +
            "key: everybody 2\n" +
            "  decomp: *\n" +
            "    reasmb: goto everyone\n" +
            "key: nobody 2\n" +
            "  decomp: *\n" +
            "    reasmb: goto everyone\n" +
            "key: noone 2\n" +
            "  decomp: *\n" +
            "    reasmb: goto everyone\n" +
            "key: always 1\n" +
            "  decomp: *\n" +
            "    reasmb: Can you think of a specific example ?\n" +
            "    reasmb: When ?\n" +
            "    reasmb: What incident are you thinking of ?\n" +
            "    reasmb: Really, always ?\n" +
            "key: alike 10\n" +
            "  decomp: *\n" +
            "    reasmb: In what way ?\n" +
            "    reasmb: What resemblence do you see ?\n" +
            "    reasmb: What does that similarity suggest to you ?\n" +
            "    reasmb: What other connections do you see ?\n" +
            "    reasmb: What do you suppose that resemblence means ?\n" +
            "    reasmb: What is the connection, do you suppose ?\n" +
            "    reasmb: Could here really be some connection ?\n" +
            "    reasmb: How ?\n" +
            "key: like 10\n" +
            "  decomp: * @be *like *\n" +
            "    reasmb: goto alike";
}

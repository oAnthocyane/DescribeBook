classDiagram
direction BT
class Author {
  + Author(String) 
  + lay() void
  + leafe(roomThings) void
  + could(thinkActions) void
  + thinkAbout(thinkActions, intonations) void
  + wentTo(roomThings) void
  + pullBack(roomThings) void
  + watchOn(roomThings) void
  + thinkAbout(thinkActions) void
  + sitOn(roomThings) void
  + say(String, intonations) void
  + want(thinkActions) void
  + stepBackFrom(roomThings) void
}
class Eye {
  + Eye() 
  + roll() void
}
class Eyebrows {
  + Eyebrows() 
  + raise() void
}
class Hand {
  + Hand(String) 
  + wave() void
  + wiggle() void
}
class Head {
  + Head() 
  + shook() void
}
class Head {
  + Head() 
  + confuse() void
}
class Human {
  + Human(String) 
  + Human(String, int) 
  # int voiceLevel
  # String name
  + say(String) void
   String name
   int voiceLevel
}
class IVoiceControl {
<<Interface>>
  + increaceVoice() void
  + reductionVoice() void
  + babble() void
   int voiceLevel
}
class Main {
  + Main() 
  + main(String[]) void
}
class OldWoman {
  + OldWoman(String, int) 
  + increaceVoice() void
  + reductionVoice() void
  + babble() void
   int voiceLevel
}
class Roman {
  + Roman(String, int) 
  + smile() void
  + reductionVoice() void
  + babble() void
  + wentOut() void
  + increaceVoice() void
   int voiceLevel
}
class Teeth {
  + Teeth() 
  + grind() void
}
class Volodya {
  + Volodya(String) 
}
class intonations {
<<enumeration>>
  + intonations() 
  + valueOf(String) intonations
  + values() intonations[]
}
class roomThings {
<<enumeration>>
  + roomThings() 
  + values() roomThings[]
  + valueOf(String) roomThings
}
class thinkActions {
<<enumeration>>
  + thinkActions() 
  + valueOf(String) thinkActions
  + values() thinkActions[]
}

Author  -->  Human 
Roman  -->  Eye 
Roman  -->  Eyebrows 
Roman  -->  Hand 
Author  -->  Head 
Roman  -->  Head 
OldWoman  -->  Human 
OldWoman  ..>  IVoiceControl 
Roman  -->  Human 
Roman  ..>  IVoiceControl 
Roman  -->  Teeth 
Volodya  -->  Human 

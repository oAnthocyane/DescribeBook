classDiagram
direction BT
class Author {
  + Author(String) 
  + pullBack(RoomThings) void
  + sayGoodbyeWith(Human) void
  + say(String, Intonations) void
  + watchOn(Essence) void
  + thinkAbout(Intonations, ThinkActions) void
  + hurtsBack() void
  + lookAround() void
  + lay() void
  + wentTo(RoomThings) void
  + stepBackFrom(RoomThings) void
  + leafe(Intonations, Essence) void
  + spitOn(Human) void
  + notCould(ThinkActions) void
  + sitOn(RoomThings) void
  + want(ThinkActions) void
  + confuseHead() void
  + wantTo(ThinkActions, ThinkActions, ThinkActions) void
  + thinkAbout(ThinkActions, int) void
}
class Back {
  + Back() 
  + hurts() String
}
class Bark {
  + Bark(String, String, String) 
  + wasOn(Oak) void
}
class Book {
  + Book(String, String, String) 
  + layOn(RoomThings) void
}
class Chair {
  + Chair(String, String) 
  + stayInFrontOf(Furniture) void
}
class Essence {
  + Essence(String) 
  # String name
  + describe() void
   String name
   String nameInAccusativeCase
   String nameInDativeCase
   String nameInInstrumentalCaseW
   String nameInPrepositionalCase
   String nameInGenitiveCase
   String nameInInstrumentalCaseM
}
class Eyebrows {
  + Eyebrows() 
  + raise() String
}
class Eyes {
  + Eyes() 
  + roll() String
}
class Floor {
  + Floor(String) 
  + cover(RoomThings) void
  + scrape() void
}
class Furniture {
  + Furniture(String) 
  + Furniture(String, String) 
  + was(RoomThings, int) void
  - toStringCount(int) String
}
class Hand {
  + Hand(String, String) 
  + wiggle() String
  + wave() String
}
class Hanger {
  + Hanger(String) 
  + wasAt(RoomThings) void
  + with(RoomThings, RoomThings, RoomThings, RoomThings, RoomThings) void
}
class Head {
  + Head() 
  + confuse() String
}
class Head {
  + Head() 
  + shook() String
}
class Human {
  + Human(String) 
  + Human(String, int) 
  # int voiceLevel
  + say(String) void
   int voiceLevel
}
class Intonations {
<<enumeration>>
  - Intonations(String) 
  - String name
  + valueOf(String) Intonations
  + values() Intonations[]
   String name
}
class Main {
  + Main() 
  + main(String[]) void
}
class Mirror {
  + Mirror(String, String, String) 
  + hangInFrontOf(RoomThings, RoomThings) void
}
class Oak {
  + Oak(String) 
  + Oak(String, String, String) 
  + wasFrom(RoomThings) void
  + was() void
}
class OldWoman {
  + OldWoman(String, int) 
  + increaceVoice() void
  + babble() void
  + reductionVoice() void
  + say(String) void
   int voiceLevel
}
class Oven {
  + Oven(String, String, String) 
  + shine(RoomThings) void
  + wentInto(RoomThings) void
  + describe() void
}
class Roman {
  + Roman(String, int) 
  + grindTeeth() void
  + babble() void
  + reductionVoice() void
  + smile() void
  + waveHand() void
  + raiseEyebrows() void
  + say(String, String, RoomThings) void
  + increaceVoice() void
  + shookHand() void
  + wiggleHand() void
  + wentOut(String) void
  + rollEyes() void
   int voiceLevel
}
class RoomThings {
<<enumeration>>
  - RoomThings(String) 
  - String name
  + values() RoomThings[]
  + valueOf(String) RoomThings
   String name
   String nameInGenitiveCaseW
   String nameInDativeCase
   String nameInInstrumentalCaseW
   String nameInGenitiveCaseM
   String nameInPrepositionalCase
   String nameInInstrumentalCaseM
}
class Roots {
  + Roots(String, String, String) 
  + describe() void
  + cover(Oak) void
}
class Sofa {
  + Sofa(String, String) 
  + loacateNear(RoomThings) void
  + describe() void
}
class Status {
<<enumeration>>
  + Status() 
  + values() Status[]
  + valueOf(String) Status
}
class Status {
<<enumeration>>
  + Status() 
  + valueOf(String) Status
  + values() Status[]
}
class Status {
<<enumeration>>
  + Status() 
  + values() Status[]
  + valueOf(String) Status
}
class Table {
  + Table(String, String) 
  + stayAt(RoomThings) void
  + describe() void
}
class TableCloth {
  + TableCloth(String, String, String, String) 
  + on(Furniture) void
  + describe() void
}
class Teeth {
  + Teeth() 
  + grind() String
}
class ThinkActions {
<<enumeration>>
  - ThinkActions(String) 
  - String name
  + values() ThinkActions[]
  + valueOf(String) ThinkActions
   String name
}
class VoiceControl {
<<Interface>>
  + babble() void
  + reductionVoice() void
  + increaceVoice() void
   int voiceLevel
}

Author  -->  Human 
Author  -->  Back 
Bark  -->  Oak 
Book  -->  Essence 
Chair  -->  Table 
Roman  -->  Eyebrows 
Roman  -->  Eyes 
Floor  -->  Furniture 
Furniture  -->  Essence 
Roman  -->  Hand 
Hanger  -->  Furniture 
Author  -->  Head 
Roman  -->  Head 
Human  -->  Essence 
Mirror  -->  Oven 
Oak  -->  Essence 
OldWoman  -->  Human 
OldWoman  ..>  VoiceControl 
Oven  -->  Furniture 
Roman  -->  Human 
Roman  ..>  VoiceControl 
Roots  -->  Oak 
Sofa  -->  Table 
Eyebrows  -->  Status 
Eyes  -->  Status 
Teeth  -->  Status 
Table  -->  Furniture 
TableCloth  -->  Furniture 
Roman  -->  Teeth 

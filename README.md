# lab5

<b>-Linus</b>

carwashState 

<strike>FIFO carqueue</strike>

CarFactory - Skapar bilobjekt med ett innehållande id.

Car - Bilobjekt som innehåller bilens id.

carLeaves event 

<b>-Viktor</b>

<strike>EventQueue</strike>

<strike>Sorted Sequence</strike>

<b>-Oskar</b>



MainSim

Simulator

SimView

carwashView

Event 

Stop event 



carArrives event 

SimState 


RandomStreams 




carArrives event()
{
<i>

  skapa en bil från fabriken
  
  kolla om det finns ledig tvätt
  
  sätta bilen i tvätten om möjligt
  
  då också sätta in ett event när bilen är klar
  
  ändra antalet lediga tvättar
  
  om inte så placera bilen i kön
  
  alltid uppdatera kötid
  
  uppdatera idleMachineTime
  
  om den blir rejected så uppdatera den variabeln
  
  uppdatera last event tiden</i>
  
}

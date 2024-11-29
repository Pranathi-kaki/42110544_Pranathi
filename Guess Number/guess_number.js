var guess = Math.floor((Math.random()*100)+1)
console.log(guess)
let count=0
game_status = 1
function check()
{   
if (game_status==1)
{
    count++
    let val = document.forms[0]['val'].value
    console.log(val)
        if(guess==val)
        {
            document.getElementById("hint").innerHTML="Guess is correct"
            document.getElementById("Attempts").innerHTML="Attempts: "+count
            let button = document.getElementById("CHECK").innerHTML="reset"
            game_status=0
        }
        else if(val<guess){
            document.getElementById("hint").innerHTML="Guess is lower"
            document.getElementById("Attempts").innerHTML="Attempts: "+count
        }
        else{
            document.getElementById("hint").innerHTML="Guess is higher"
            document.getElementById("Attempts").innerHTML="Attempts: "+count
        }
      
    }
    else
    {
        reset()
    }
}
function reset()
{
        guess = Math.floor((Math.random()*100)+1)
        console.log(guess)
        game_status = 1
        count=0
        button = document.getElementById("CHECK").innerHTML="click"
        document.getElementById("Attempts").innerHTML="Attempts: "+count
        document.getElementById("input_1").value="";
}

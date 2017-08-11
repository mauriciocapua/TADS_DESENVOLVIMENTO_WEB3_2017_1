var Session = {};

var atendente = {};
var data = new Date(year, month, day, hours, minutes, seconds, milliseconds);

function validateForm() {
    //var x = document.forms["myForm"]["fname"].value;
    //document.getElementById("teste").style.display = "none"; 
    if (document.forms["FormLogin"]["flogin"].value == "") {
        alert("Login must be filled out");
        return false;
    }
    else if(document.forms["FormLogin"]["fpassword"].value	 == "") {
        alert("Password must be filled out");
        return false;
    }

    else{
      document.getElementById("divLogin").style.display = "none";
      document.getElementById("divNota").style.display = "block"; 

        atendente.login = document.forms["FormLogin"]["flogin"].value();

        
        
        document.getElementById("labelNota").innerHTML = "ID TESTE";
        document.getElementById("labelNota").innerHTML = atendente.login;
        document.getElementById("labelNota").innerHTML = data.
      alert("Access granted");

      return true;
  }
}

function myCreateFunction() {
    var table = document.getElementById("itemTable");
    var row = table.insertRow(0);
    
    var cell1 = row.insertCell(0);
    
    cell1.innerHTML = "NEW CELL1";
    
}


function myDeleteFunction() {
    document.getElementById("itemTable").deleteRow().last();
}


function addTableFunction() {
    var table = document.getElementById("addHere").;
    var itemCodigo = document.getElementById("inputItemCodigo").value;
    var precoQuantidade = document.getElementById("inputPrecoQuantidade").value;
    console.log(itemCodigo);
    console.log(document.getElementById("itemTable").lastChild.innerHTML); 


    /*var row = table.insertRow(2); 
    row.innerHTML = 
                        '<td id="numeroLista"></td>'+
                        '<td><label></label>'+itemCodigo+'</td>'+
                        '<td><label></label></td>'+
                        '<td><label></label>'+precoQuantidade+'</td>'+
                        '<td><label></label></td>';

    table.append('<tr><td id="numeroLista"></td>'+
                        '<td><label></label>'+itemCodigo+'</td>'+
                        '<td><label></label></td>'+
                        '<td><label></label>'+precoQuantidade+'</td>'+
                        '<td><label></label></td>'+
                '</tr>'
    );

*/
} 



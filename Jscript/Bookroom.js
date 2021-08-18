function Bookroom()
{
    var fromdate=document.getElementById("fromdate").value;
    var todate=document.getElementById("todate").value;
    var purpose=document.getElementById("purpose").value;
    var numberOfPeoples=document.getElementById("numberOfPeople").value;
    var id=document.getElementById("employeeid").value;

    if(!fromdate || !todate || !purpose)
    {
        alert("Booking Sucessful..");
        return;
    }

    var show=document.getElementById("show");
    var newRow=show.insertRow(show.length);
    var c1=newRow.insertCell(0);
    var c2=newRow.insertCell(1);
    var c3=newRow.insertCell(2);

    c1.innerHTML=fromdate;
    c2.innerHTML=todate;
    c3.innerHTML=purpose;
    row++;


}
// Normal Search 

function myFunction() {
  // Declare variables
  var input, filter, table, tr, td, i, txtValue;
  input = document.getElementById("myInput");
  filter = input.value.toUpperCase();
  table = document.getElementById("recordTable");
  tr = table.getElementsByTagName("tr");

  // Loop through all table rows, and hide those who don't match the search query
  for (i = 0; i < tr.length; i++) {
    td = tr[i].getElementsByTagName("td")[3];
    if (td) {
      txtValue = td.textContent || td.innerText;
      if (txtValue.toUpperCase().indexOf(filter) > -1) {
        tr[i].style.display = "";
      } else {
        tr[i].style.display = "none";
      }
    }
  }
}

// Advance search 

// advance search by customer id

// Normal Search 

function myFunction4() {
  // Declare variables
  var input, filter, table, tr, td, i, txtValue;
  input = document.getElementById("myInput4");
  filter = input.value.toUpperCase();
  table = document.getElementById("recordTable");
  tr = table.getElementsByTagName("tr");

  // Loop through all table rows, and hide those who don't match the search query
  for (i = 0; i < tr.length; i++) {
    td = tr[i].getElementsByTagName("td")[3];
    if (td) {
      txtValue = td.textContent || td.innerText;
      if (txtValue.toUpperCase().indexOf(filter) > -1) {
        tr[i].style.display = "";
      } else {
        tr[i].style.display = "none";
      }
    }
  }
}


//Advance search by Invoice Id

function myFunction1() {
  // Declare variables
  var input, filter, table, tr, td, i, txtValue;
  input = document.getElementById("myInput1");
  filter = input.value.toUpperCase();
  table = document.getElementById("recordTable");
  tr = table.getElementsByTagName("tr");

  // Loop through all table rows, and hide those who don't match the search query
  for (i = 0; i < tr.length; i++) {
    td = tr[i].getElementsByTagName("td")[16];
    if (td) {
      txtValue = td.textContent || td.innerText;
      if (txtValue.toUpperCase().indexOf(filter) > -1) {
        tr[i].style.display = "";
      } else {
        tr[i].style.display = "none";
      }
    }
  }
}

//Advance search by document Id

function myFunction2() {
  // Declare variables
  var input, filter, table, tr, td, i, txtValue;
  input = document.getElementById("myInput2");
  filter = input.value.toUpperCase();
  table = document.getElementById("recordTable");
  tr = table.getElementsByTagName("tr");

  // Loop through all table rows, and hide those who don't match the search query
  for (i = 0; i < tr.length; i++) {
    td = tr[i].getElementsByTagName("td")[6];
    if (td) {
      txtValue = td.textContent || td.innerText;
      if (txtValue.toUpperCase().indexOf(filter) > -1) {
        tr[i].style.display = "";
      } else {
        tr[i].style.display = "none";
      }
    }
  }
}


//Advance search by business Year

function myFunction3() {
  // Declare variables
  var input, filter, table, tr, td, i, txtValue;
  input = document.getElementById("myInput3");
  filter = input.value.toUpperCase();
  table = document.getElementById("recordTable");
  tr = table.getElementsByTagName("tr");

  // Loop through all table rows, and hide those who don't match the search query
  for (i = 0; i < tr.length; i++) {
    td = tr[i].getElementsByTagName("td")[5];
    if (td) {
      txtValue = td.textContent || td.innerText;
      if (txtValue.toUpperCase().indexOf(filter) > -1) {
        tr[i].style.display = "";
      } else {
        tr[i].style.display = "none";
      }
    }
  }
}


function addData() {
    var businessCode = document.getElementById('businessCode').value;
    var customerNumber = document.getElementById('customerNumber').value;
    var clearDate = document.getElementById('clearDate').value;
    var businessYear = document.getElementById('businessYear').value;
    var docId = document.getElementById('docId').value;
    var postingDate = document.getElementById('postingDate').value;
    var documentCreateDate = document.getElementById('documentCreateDate').value;
    var dueInDate = document.getElementById('dueInDate').value;
    var inVoiceCurrency = document.getElementById('inVoiceCurrency').value;
    var documentType = document.getElementById('documentType').value;
    var postingId = document.getElementById('postingId').value;
    var totalOpenAmount = document.getElementById('totalOpenAmount').value;
    var baseLineCreateDate = document.getElementById('baseLineCreateDate').value;
    var custPaymentTerms = document.getElementById('custPaymentTerms').value;
    var invoiceId = document.getElementById('invoiceId').value;



    if (businessCode == 'undefined' || businessCode == '') {
        alert("Business Code can't be Empty!");
        return;
    }
     if (customerNumber == 'undefined' || customerNumber == '') {
        alert("Customer Number can't be Empty!");
        return;
    }
     if (clearDate == 'undefined' || clearDate == '') {
        alert("Clear Date can't be Empty!");
        return;
    }
     if (businessYear == 'undefined' || businessYear == '') {
        alert("Business Year  can't be Empty!");
        return;
    }
     if (docId == 'undefined' || docId == '') {
        alert("Document Id can't be Empty!");
        return;
    }
     if (postingDate == 'undefined' || postingDate == '') {
        alert("Posting Date can't be Empty!");
        return;
    }
     if (documentCreateDate == 'undefined' || documentCreateDate == '') {
        alert("document Create Date can't be Empty!");
        return;
    }
     if (dueInDate == 'undefined' || dueInDate == '') {
        alert("due In Date can't be Empty!");
        return;
    }
     if (inVoiceCurrency == 'undefined' || inVoiceCurrency == '') {
        alert("InVoice Currency can't be Empty!");
        return;
    }
     if (documentType == 'undefined' || documentType == '') {
        alert("Document Type can't be Empty!");
        return;
    }
     if (postingId == 'undefined' || postingId == '') {
        alert("Posting Id can't be Empty!");
        return;
    }
    if (totalOpenAmount == 'undefined' || totalOpenAmount == '') {
        alert("Total Open Amount can't be Empty!");
        return;
    }
    if (baseLineCreateDate == 'undefined' || baseLineCreateDate == '') {
        alert("BaseLine Create Date can't be Empty!");
        return;
    }
    if (custPaymentTerms == 'undefined' || custPaymentTerms == '') {
        alert("Customer Payment Terms can't be Empty!");
        return;
    }
    if (invoiceId == 'undefined' || invoiceId == '') {
        alert("Invoice Id can't be Empty!");
        return;
    }

    //ajax call


    var formData = {
        "businessCode": businessCode,
        "customerNumber": customerNumber,
        "clearDate": clearDate,
        "businessYear": businessYear,
        "docId": docId,
        "postingDate": postingDate,
        "documentCreateDate": documentCreateDate,
        "dueInDate": dueInDate,
        "inVoiceCurrency": inVoiceCurrency,
        "documentType": documentType,
        "postingId": postingId,
        "totalOpenAmount": totalOpenAmount,
        "baseLineCreateDate": baseLineCreateDate,
        "custPaymentTerms": custPaymentTerms,
        "invoiceId": invoiceId

    }

    $
        .ajax({
            url: "AddInvoice",
            type: "POST",
            data: formData,
            success: function (response) {

                if (response.trim() == 'success') {
                    alert("Data added successfully");
                    $('#add').modal('hide');
                }
                else {
                    alert("data not added");
                }

            },
            error: function (error) {
                alert("error = " + error);
            }
        });
}

function deleteData() {
    var deleteCheckBox = document.getElementsByName('deleteCheckBox');

    var str = ""
    for (var i = 0; i < deleteCheckBox.length; i++) {
        if (deleteCheckBox[i].checked) {
            str = str + deleteCheckBox[i].value + "@";
        }
    }

    if (str.length < 1) {
        alert("Please check one check box atleast");
        return;
    }
    $
        .ajax({
            url: "DeleteInvoice",
            type: "POST",
            data: { "sNo": str },
            success: function (response) {
                if (response.trim() == 'success')
                    alert((str.split("@").length - 1) + " item deleted successfully");
                else {
                    alert('item deleted successfully');
                }
                window.location.reload();
            },
            error: function (error) {
                alert("error = " + error);
            }
        });
}

// Edit section 

function editData() {
    var deleteCheckBox = document.getElementsByName('deleteCheckBox');

    var inVoiceCurrency = document.getElementById('inVoiceCurrency1').value;
    var custPaymentTerms = document.getElementById('custPaymentTerms1').value;
    var siNo = ""

    for (var i = 0; i < deleteCheckBox.length; i++) {
        if (deleteCheckBox[i].checked) {
            siNo = deleteCheckBox[i].value;
            break;
        }
    }

    $
        .ajax({
            url: "EditInvoice",
            type: "POST",
            data: { "siNo": siNo, "inVoiceCurrency": inVoiceCurrency, "custPaymentTerms": custPaymentTerms },
            success: function (response) {
                if (response.trim() == 'success')
                    alert(" item Updated successfully with id = " + siNo);
                else {
                    alert(" Something wrong !");
                }
                window.location.reload();
            },
            error: function (error) {
                alert("error = " + error);
            }
        });
}


function checkEdit() {

    var deleteCheckBox = document.getElementsByName('deleteCheckBox');
    var siNo = ""
    var index = 0;
    var flg = false;
    for (var i = 0; i < deleteCheckBox.length; i++) {
        if (flg) {
            alert('You have selected 1 Box not an issue if multiple check boxes selected then only first will be counted ');
            break;
        }
        if (deleteCheckBox[i].checked) {
            siNo = deleteCheckBox[i].value;
            index = i;
            flg = true;
        }
    }

    if (siNo.length == '') {
        alert("Please check one check box atleast");
        return;
    }

    var dataBody = document.getElementById('dataBody');
    document.getElementById('inVoiceCurrency1').value = dataBody.children[index].children[10].innerHTML;
    document.getElementById('custPaymentTerms1').value = dataBody.children[index].children[15].innerHTML;
}

function selectAllRow(input) {
    var deleteCheckBox = document.getElementsByName('deleteCheckBox');
    for (var i = 0; i < deleteCheckBox.length; i++) {
        if (input.checked)
            deleteCheckBox[i].checked = true;
        else
            deleteCheckBox[i].checked = false;

    }
    disableButtons();
}


function disableButtons() {
    var deleteCheckBox = document.getElementsByName('deleteCheckBox');
    for (var i = 0; i < deleteCheckBox.length; i++) {

        if (deleteCheckBox[i].checked) {
            document.getElementById('predictButton').disabled=false;
            document.getElementById('editButton').disabled=false;
            document.getElementById('deleteButton').disabled=false;
            return;
        }
    }
    document.getElementById('predictButton').disabled=true;
    document.getElementById('editButton').disabled=true;
    document.getElementById('deleteButton').disabled=true;
    
    
    function SearchData() {

    var documentId = document.getElementById('myInput2').value;
    var invoiceId = document.getElementById('myInput1').value;
    var customerNumber = document.getElementById('myInput4').value;
    var bussinessYear = document.getElementById('myInput3').value;
   
    $
        .ajax({
            url: "AdvanceSearch",
            type: "POST",
            data: { "siNo": siNo, "inVoiceCurrency": inVoiceCurrency, "custPaymentTerms": custPaymentTerms },
            success: function (response) {
                if (response.trim() == 'success')
                    alert(" item Updated successfully with id = " + siNo);
                else {
                    alert(" Something wrong !");
                }
                window.location.reload();
            },
            error: function (error) {
                alert("error = " + error);
            }
        });
}
}
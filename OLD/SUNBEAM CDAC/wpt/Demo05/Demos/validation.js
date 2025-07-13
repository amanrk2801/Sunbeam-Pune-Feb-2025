 function IsEmpty(controlid, errorcontrolid, errorMessage) {
        var refToTxtBox = document.getElementById(controlid);
        var refToDivForErrorMessage = document.getElementById(errorcontrolid);

        var dataInTxtBox = refToTxtBox.value;

        if (dataInTxtBox != "") {
          refToDivForErrorMessage.innerText = "";
          console.log(dataInTxtBox);
        } else {
          refToDivForErrorMessage.innerText = errorMessage;
        }
      }
   
//NomineeDetails
function saveNomineeDetails() {
	var firstName = document.getElementById("firstName");
	sessionStorage.setItem("firstName", firstName.value);
	
	var middleName = document.getElementById("middleName");
	sessionStorage.setItem("middleName", middleName.value);
	
	var lastName = document.getElementById("lastName");
	sessionStorage.setItem("lastName", lastName.value);
	
	var suffix = document.getElementById("suffix");
	sessionStorage.setItem("suffix", suffix.value);
	
	var ssn1 = document.getElementById("ssn1");
	var ssn2 = document.getElementById("ssn2");
	var ssn3 = document.getElementById("ssn3");
	sessionStorage.setItem("ssn", ssn1.value+ssn2.value+ssn3.value);
	
	var dob = document.getElementById("dob");
	sessionStorage.setItem("dob", dob.value);
	
	var motherMName = document.getElementById("motherMName");
	sessionStorage.setItem("motherMName", motherMName.value);
}

//AccountDetails
function displayNominee() {
   var x = document.getElementById("nominee-checkbox");
   if(x.checked) {
         document.getElementById("continue").setAttribute("value","Add Nominee");
         document.accountForm.action = "/nomineeDetails";
   } else {
         document.getElementById("continue").setAttribute("value","Submit");
         document.accountForm.action = "/confirmation";
   }      
}

function accountSelect(select) {
	if(select == "Online Transfer") {
		document.getElementById("bank").style.display = "block";
		document.getElementById("check").style.display = "none";
	} else {
		document.getElementById("check").style.display = "block";
		document.getElementById("bank").style.display = "none";
	}
}

function minBalSelect(select) {
	if(select == "Checking Account") {
		document.getElementById("amtWarning").style.display = "block";
	} else {
		document.getElementById("amtWarning").style.display = "none";
	}
}

function saveAccountDetails() {
	sessionStorage.setItem("accType", document.getElementById("account").value);
}

//PersonalInfo
function savePersonalDetails() {
	var firstName = document.getElementById("firstName");
	sessionStorage.setItem("firstName", firstName.value);
	
	var middleName = document.getElementById("middleName");
	sessionStorage.setItem("middleName", middleName.value);
	
	var lastName = document.getElementById("lastName");
	sessionStorage.setItem("lastName", lastName.value);
	
	var suffix = document.getElementById("suffix");
	sessionStorage.setItem("suffix", suffix.value);
	
	var ssn1 = document.getElementById("ssn1");
	var ssn2 = document.getElementById("ssn2");
	var ssn3 = document.getElementById("ssn3");
	sessionStorage.setItem("ssn", ssn1.value+ssn2.value+ssn3.value);
	
	var dob = document.getElementById("dob");
	sessionStorage.setItem("dob", dob.value);
	
	var motherMName = document.getElementById("motherMName");
	sessionStorage.setItem("motherMName", motherMName.value);
	
}

function autotab(current,to) {
	if(current.getAttribute && current.value.length==current.getAttribute("maxlength")) {
		to.focus()
	}
}

function isNumberKey(evt) {
    var charCode = (evt.which) ? evt.which : event.keyCode;
    if ((charCode < 48 || charCode > 57))
        return false;
    return true;
}

function isAlphaKey(evt) {
    var charCode = (evt.which) ? evt.which : event.keyCode;
    if (!((charCode >= 97 && charCode <= 122) || (charCode >= 65 && charCode <= 90) ||charCode == 08))
        return false;
    
    return true;
}

//ContactDetails
function saveContactDetails() {
		var address1 = document.getElementById("address1");
	sessionStorage.setItem("address1", address1.value);
	
	var address2 = document.getElementById("address2");
	sessionStorage.setItem("address2", address2.value);
	
	var city = document.getElementById("city");
	sessionStorage.setItem("city", city.value);
	
	var state = document.getElementById("state");
	sessionStorage.setItem("state", state.value);
	
	var postal = document.getElementById("postal");
	sessionStorage.setItem("postal", postal.value);
	
	var country = document.getElementById("country");
	sessionStorage.setItem("country", country.value);
	
	var phone = document.getElementById("phone");
	sessionStorage.setItem("phone", phone.value);
		
	var email = document.getElementById("email");
	sessionStorage.setItem("email", email.value);

}

//index page
function openCity(evt, cityName) {
    // Declare all variables
    var i, tabcontent, tablinks;

    // Get all elements with class="tabcontent" and hide them
    tabcontent = document.getElementsByClassName("tabcontent");
    for (i = 0; i < tabcontent.length; i++) {
        tabcontent[i].style.display = "none";
    }

    // Get all elements with class="tablinks" and remove the class "active"
    tablinks = document.getElementsByClassName("tablinks");
    for (i = 0; i < tablinks.length; i++) {
        tablinks[i].className = tablinks[i].className.replace(" active", "");
    }

    // Show the current tab, and add an "active" class to the button that opened the tab
    document.getElementById(cityName).style.display = "block";
    evt.currentTarget.className += " active";
} 
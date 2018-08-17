/*//<script type="text/javascript">


//create function 
function($, .keyup))
$('#phone').keyup(function(e) {
	
//	function phoneKey(event){
	
	var numbers = this.value.replace(/\D/g, '');
	// alert(numbers.length);
	var specialChar = {
		3 : '-',
		6 : '-'
	};
	this.value = '';
	for (var i = 0; i < numbers.length; i++) {
		this.value += (specialChar[i] || '') + numbers[i];
	}
})
*/
$(document).ready(function () {
    $("#msg").click(function () {  
    	var content = $("#msgInput").val();
    	alert(content);
    	var params = {
    			dnaSeg:content
        };
    	// AJAX post
    	$.post("segmentInput.action", params, callbackFun, 'json');   
    	function callbackFun(data) {
             alert(data);
         }   
        
    });  
});  
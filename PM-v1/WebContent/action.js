/**
 * 
 */

$(document).ready(function(){
	let productForm=$('#product-form');
	productForm.hide();
	
	$('#new-btn').click(function(){
		productForm.slideDown();
		$(this).hide();
	});
	
	$("#cancel-btn").click(function(){
		console.log('cancel..');
		productForm.slideUp();
		$('#new-btn').show();
	});
});

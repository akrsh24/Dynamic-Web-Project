

$(document).ready(function () {

    let employeeForm = $('#employee-form');

    function requiredValidator(field) {
        let val = field.val();
        let closestDiv = field.closest('div')
        if (!val) {
            closestDiv.addClass('has-error');
            field.next('.help-block').remove();
            let errorElement = $('<div class="help-block">Field is Required</div>');
            field.after(errorElement);
            return false;
        } else {
            closestDiv.removeClass('has-error').addClass('has-success');
            field.next('.help-block').remove();
            return true;
        }

    }
    employeeForm.on('submit', function (e) {
        e.preventDefault();
        let firstNameField = $('#firstName', $(this));
        let valid = false;
        if (requiredValidator(firstNameField)) {
            valid = true;
        }

        // if form valid , submit to server-side programs
        console.log('Break..');
        console.log(valid);

    });

});
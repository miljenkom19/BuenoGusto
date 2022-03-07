(function ($) {

    "use strict";

    var fullHeight = function () {

        $('.js-fullheight').css('height', $(window).height());
        $(window).resize(function () {
            $('.js-fullheight').css('height', $(window).height());
        });

    };
    fullHeight();

    $(".toggle-password").click(function () {

        $(this).toggleClass("fa-eye fa-eye-slash");
        var input = $($(this).attr("toggle"));
        if (input.attr("type") === "password") {
            input.attr("type", "text");
        } else {
            input.attr("type", "password");
        }
    });

})(jQuery);

function validate() {
	const username = document.getElementById("username").value;
	const password = document.getElementById("password").value;

	if (username.length < 4 || username.length > 20 || password.length < 4 || password.length > 20) {
        alert("Please make your username and password between 4 and 20 characters long")
        return false
    } else {
        return true;
    }
}

$(document).ready(function() {
    $.ajax({
        url: "/msg"
    }).then(function(data) {
       $('.greeting-id').append(data.id);
       $('.greeting-content').append(data.content);
    });
});
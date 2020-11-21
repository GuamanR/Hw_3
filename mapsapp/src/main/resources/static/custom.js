// let map;
// var map;
// function initMap() {
//     map = new google.maps.Map(document.getElementById('map'), {
//         center: {lat: 39.9612, lng: -82.9988},
//         zoom: 10,
//         scrollwheel: false
//     });
// }

// function initMap() {
//     map = new google.maps.Map(document.getElementById('map'), {
//         center: {lat: 39.9612, lng: -82.9988},
//         zoom: 10
//     });
// }
let map;
let marker;
let contentString= "<h2>" +city + ", "+state + "</h2>"
function initMap() {
    let image = {
        url : "https://developers.google.com/maps/documentation/javascript/examples/full/images/beachflag.png"
    };

    map = new google.maps.Map(document.getElementById('map'), {
        center: coords,
        zoom: 10,
        scrollwheel: false
    });
    marker = new google.maps.Marker({    
        position: coords,    
        map: map, 
        icon: image,
        animation: google.maps.Animation.BOUNCE,
     });


    let infowindow = new google.maps.InfoWindow({
        content: contentString
        });

        google.maps.event.addListener(marker, 'click', function() {
            infowindow.open(map,marker);
        });
}
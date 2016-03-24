<!DOCTYPE html>
<html>
  <head>
    <style>
      #map {
        width: 500px;
        height: 400px;
      }
    </style>
  </head>
  <body>
    <div id="map"></div>
    <?php   
      
      $name=addslashes($_GET['name']);
      $address=$_GET['address'];
      $lat=$_GET['lat'];
      $lng=$_GET['lng'];
 
    ?>
    <script>
      function initMap() {
        var myLatLng = {lat: <?php echo $lat; ?> , lng: <?php echo $lng; ?>};
        var mapDiv = document.getElementById('map');
        var map = new google.maps.Map(mapDiv, {
          center: myLatLng,
          zoom: 15
        });
        var marker = new google.maps.Marker({
        position: myLatLng,
        map: map,
        title: '<?php echo $name; ?>'
        });
        
      }
      
      
    </script>
    <script src="https://maps.googleapis.com/maps/api/js?callback=initMap"
        async defer></script>
  </body>
</html>

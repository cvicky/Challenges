

//Instantiate the wrappers
var SpotifyWebApi = require('spotify-web-api-node');

//Instantiate the excel wrapper
var Excel = require('exceljs');
 
// credentials are optional 
var spotifyApi = new SpotifyWebApi({
  clientId : 'enter client id',
  clientSecret : 'enter secret id',
  redirectUri : 'http://www.example.com/callback'
});

/*

// Get Elvis' albums
spotifyApi.getArtistAlbums('2wUjUUtkb5lvLKcGKsKqsR', { limit: 5, offset: 20 }, function(err, data) {
  if (err) {
    console.error('Something went wrong!');
  } else {
    console.log(data.body);
  }
});
*/

//search for an Artist and their genres
var link = '';
spotifyApi.searchArtists('Alessia Cara')
  .then(function(data) {
    console.log('Search artists by "Alessia Cara"', data.body.artists.href); //get the link for more artist details
    console.log(data.body.artists.items[0].genres);
    for(var i=0; i<data.body.artists.items[0].genres.length; i++){
    	console.log(data.body.artists.items[0].genres[i]);
    }
  }, function(err) {
    console.error(err);
  });


/*

// Search tracks whose artist's name contains 'Love' 
spotifyApi.searchTracks('artist:Alessia Cara')
  .then(function(data) {
    console.log('Search tracks by "Alessia Cara" in the artist name', data.body.tracks.items[0].uri);

    // Add tracks to a playlist 
	spotifyApi.addTracksToPlaylist('excel.v.spotify', '6o8rIMnBKNmEoQiaKxCnTW', [data.body.tracks.items[0].uri])
	  .then(function(data) {
	    console.log('Added tracks to playlist!');
	  }, function(err) {
	    console.log('Something went wrong, cant add track!', err);
	  });


  }, function(err) {
    console.log('Something went wrong!', err);
  });

  */

/*
// get albums by a certain artist
spotifyApi.getArtistAlbums('2wUjUUtkb5lvLKcGKsKqsR')
  .then(function(data) {
    console.log('Artist albums', data.body);
  }, function(err) {
    console.error(err);
  });

*/

  //================================ EXCEL SHEET
var workbook = new Excel.Workbook();
workbook.creator = 'Vicky';
workbook.lastModifiedBy = 'Her';
workbook.created = new Date(1985, 8, 30);
workbook.modified = new Date();
workbook.lastPrinted = new Date(2016, 9, 27);

workbook.views = [
  {
    x: 0, y: 0, width: 10000, height: 20000, 
    firstSheet: 0, activeTab: 1, visibility: 'visible'
  }
]

//read from the excel file
workbook.xlsx.readFile('list.xlsx')
    .then(function() {
        // use workbook
        var worksheet = workbook.getWorksheet('Artist');
        var artCol = worksheet.getCell('A2').value;
        console.log(artCol);
       	//console.log(artCol.worksheet._rows[0]._worksheet);

	


    });

/*
//create a sheet called what's in the ''
var sheet = workbook.addWorksheet('Artist');

sheet.columns = [
		    { header: 'Artist', key: 'artist', width: 20 },
		    { header: 'Genres', key: 'genres', width: 32 },
		];
sheet.addRow({artist: 'Alessia', genres: 'pop'});

//write to the excel file
workbook.xlsx.writeFile('alist.xlsx')
    .then(function() {
        // done
    });

*/

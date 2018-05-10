import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class HashSetTest{

	class Song{
		int songId;
		String title;
		String artist;

		Song(int songId,String title, String artist){
			this.songId = songId;
			this.title = title;
			this.artist = artist;
		}

		public String getTitle(){
			return this.title;
		}

		@Override
        public boolean equals(Object o) {
	        if (this == o) return true;
	        if (!(o instanceof Song)) return false;

	        Song song = (Song) o;
	        if(this.songId != song.songId)
	        	return false;
	        if(!this.title.equals(song.title))
	        	return false;
	        if(!this.artist.equals(song.artist))
	        	return false;
	        return true;
        }

	    @Override
	    public int hashCode() {
	        return title.hashCode()+artist.hashCode()+songId;
    	}

	}

	public static void main(String args[]){
		HashSetTest object = new HashSetTest();
		HashSet<Song> songSet = new HashSet<>();
		ArrayList<Song> arrSongs = new ArrayList<>();
		boolean x = songSet.add(object.new Song(12,"Sade Warga0","Bohemia"));
		boolean y = songSet.add(object.new Song(13,"Sade Warga8","Bohemia"));
		boolean z = songSet.add(object.new Song(14,"Sade Warga7","Bohemia"));
		boolean p = songSet.add(object.new Song(15,"Sade Warga1","Bohemia"));
		boolean p1 = songSet.add(object.new Song(16,"Sade Warga2","Bohemia"));
		boolean p2 = songSet.add(object.new Song(17,"Sade Warga3","Bohemia"));
		boolean p3 = songSet.add(object.new Song(18,"Sade Warga4","Bohemia"));
		boolean p4 = songSet.add(object.new Song(19,"Sade Warga5","Bohemia"));
		boolean p5 = songSet.add(object.new Song(20,"Sade Warga6","Bohemia"));


		
		arrSongs.add(object.new Song(12,"Sade Warga0","Bohemia"));
		arrSongs.add(object.new Song(13,"Sade Warga8","Bohemia"));
		arrSongs.add(object.new Song(14,"Sade Warga7","Bohemia"));
		arrSongs.add(object.new Song(15,"Sade Warga1","Bohemia"));
		arrSongs.add(object.new Song(16,"Sade Warga2","Bohemia"));
		arrSongs.add(object.new Song(17,"Sade Warga3","Bohemia"));
		arrSongs.add(object.new Song(18,"Sade Warga4","Bohemia"));
		arrSongs.add(object.new Song(19,"Sade Warga5","Bohemia"));
		arrSongs.add(object.new Song(20,"Sade Warga6","Bohemia"));
		ArrayList<Song> genreSongs = new ArrayList<>(songSet);

		for(Song songs : genreSongs){
			System.out.println(songs.getTitle());
		}
		System.out.println("----------------");

		for(Song songs : arrSongs){
			System.out.println(songs.getTitle());
		}
	}
}
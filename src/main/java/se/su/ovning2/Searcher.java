package se.su.ovning2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

public class Searcher implements SearchOperations {

  Set<String> artists = new HashSet<>();
  Set<String> genres = new HashSet<>();
  Set<String> titles = new HashSet<>();
  //private final Set<String> artists = new HashSet<>();
  //private final Set<String> genres = new HashSet<>();

  Map<String> byArtist = new HashMap<>();
  Map<String> byGenre = new HashMap<>();
  Map<String> byTitle = new HashMap<>();
  TreeMap<Integer, Set<Recording>> byYear = new TreeMap<>();
  Set<Recording> all = newHashSet<>();

  public Searcher(Collection<Recording> data) {
    Collection<Recording> recordings = data;
    for(Recording recordings : data){
      all.add(r);
      artists.add(r.getArtist());
      titles.add(r.getTitle());
      byTitle.put(r.getTitle(), r);
    }

  public Searcher(Collection<Recording> data) {
    for (Recording recording : data) {
      artists.add(recording.getArtist());
      this.genres.addAll(recording.getGenre());
    }
  }

  @Override
  public long numberOfArtists() {
    return artists.size();
  }

  @Override
  public long numberOfGenres() {
    return genres.size();
  }

  @Override
  public long numberOfTitles() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'numberOfTitles'");
  }

  @Override
  public boolean doesArtistExist(String name) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'doesArtistExist'");
  }

  @Override
  public Collection<String> getGenres() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getGenres'");
  }

  @Override
  public Recording getRecordingByName(String title) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getRecordingByName'");
  }

  @Override
  public Collection<Recording> getRecordingsAfter(int year) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getRecordingsAfter'");
  }

  @Override
  public SortedSet<Recording> getRecordingsByArtistOrderedByYearAsc(String artist) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException(
        "Unimplemented method 'getRecordingsByArtistOrderedByYearAsc'");
  }

  @Override
  public Collection<Recording> getRecordingsByGenre(String genre) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getRecordingsByGenre'");
  }

  @Override
  public Collection<Recording> getRecordingsByGenreAndYear(String genre, int yearFrom, int yearTo) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getRecordingsByGenreAndYear'");
  }

  @Override
  public Collection<Recording> offerHasNewRecordings(Collection<Recording> offered) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'offerHasNewRecordings'");
  }
}

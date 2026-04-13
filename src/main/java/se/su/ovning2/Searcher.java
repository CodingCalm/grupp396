package se.su.ovning2;

import java.util.*;

public class Searcher implements SearchOperations {

  private final Set<String> artists = new HashSet<>();
  private final Set<String> genres = new HashSet<>();
  private final Set<String> titles = new HashSet<>();
  private final Map<String, Recording> recordingsTitle = new HashMap<>();
  private final Map<Integer, Recording> recordingsYear = new HashMap<>();





  public Searcher(Collection<Recording> data) {
    for (Recording r : data) {
      this.artists.add(r.getArtist());
      this.genres.addAll(r.getGenre());
      this.titles.add(r.getTitle());
      this.recordingsTitle.put(r.getTitle(), r);
      this.recordingsYear.put(r.getYear(), r);

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
    return titles.size();
  }

  @Override
  public boolean doesArtistExist(String name) {
    return artists.contains(name);
  }

  @Override
  public Collection<String> getGenres() {
    return Collections.unmodifiableSet(genres);
  }

  @Override
  public Recording getRecordingByName(String title) {
    return recordingsTitle.get(title);
  }

  @Override
  public Collection<Recording> getRecordingsAfter(int year) {
    var result = new HashSet<Recording>();

    for(Integer i : recordingsYear.keySet()){
      if(year > i){
        result.add(recordingsYear.get(i));
      }
    }
    return result;

  }

  @Override
  public SortedSet<Recording> getRecordingsByArtistOrderedByYearAsc(String artist) {

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

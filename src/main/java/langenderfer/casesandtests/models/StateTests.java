package langenderfer.casesandtests.models;

public class StateTests {
  private int positiveScore;
  private int negativeScore;
  private int negativeRegularScore;
  private int commercialScore;
  private String grade;
  private int score;
  private int negative;
  private int pending;
  private int hospitalized;
  private int death;
  private int total;
  private String lastUpdateEt;
  private String checkTimeEt;
  private String dateModified;
  private String dateChecked;
  private String notes;
  private int positive;
  private String state;
  private int totalTestResults;
  private int population;

  public void setPositive(int positive) {
    this.positive = positive;
  }

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public String getDateModified() {
    return dateModified;
  }

  public void setDateModified(String dateModified) {
    this.dateModified = dateModified;
  }

  public String getCheckTimeEt() {
    return checkTimeEt;
  }

  public void setCheckTimeEt(String checkTimeEt) {
    this.checkTimeEt = checkTimeEt;
  }

  public String getLastUpdateEt() {
    return lastUpdateEt;
  }

  public void setLastUpdateEt(String lastUpdateEt) {
    this.lastUpdateEt = lastUpdateEt;
  }

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }

  public int getDeath() {
    return death;
  }

  public void setDeath(int death) {
    this.death = death;
  }

  public int getHospitalized() {
    return hospitalized;
  }

  public void setHospitalized(int hospitalized) {
    this.hospitalized = hospitalized;
  }

  public int getPending() {
    return pending;
  }

  public void setPending(int pending) {
    this.pending = pending;
  }

  public int getNegative() {
    return negative;
  }

  public void setNegative(int negative) {
    this.negative = negative;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

  public int getCommercialScore() {
    return commercialScore;
  }

  public void setCommercialScore(int commercialScore) {
    this.commercialScore = commercialScore;
  }

  public int getNegativeRegularScore() {
    return negativeRegularScore;
  }

  public void setNegativeRegularScore(int negativeRegularScore) {
    this.negativeRegularScore = negativeRegularScore;
  }

  public int getNegativeScore() {
    return negativeScore;
  }

  public void setNegativeScore(int negativeScore) {
    this.negativeScore = negativeScore;
  }

  public int getPositiveScore() {
    return positiveScore;
  }

  public void setPositiveScore(int positiveScore) {
    this.positiveScore = positiveScore;
  }

  public String getDateChecked() {
    return dateChecked;
  }

  public void setDateChecked(String dateChecked) {
    this.dateChecked = dateChecked;
  }

  public int getPositive() {
    return positive;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }
  public void setTotalTestResults(int totalTestResults) {
    this.totalTestResults = totalTestResults;
  }

  public int getTotalTestResults() {
    return totalTestResults;
  }

  public void setPopulation(int population) {
    this.population = population;
  }

  public int getPopulation() {
    return population;
  }


  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (int)positiveScore;
    result = 31 * result + (int)negativeScore;
    result = 31 * result + (int)negativeRegularScore;
    result = 31 * result + (int)commercialScore;
    result = 31 * result + (grade != null ? grade.hashCode() : 0);
    result = 31 * result + (int)score;
    result = 31 * result + (int)negative;
    result = 31 * result + (int)pending;
    result = 31 * result + (int)hospitalized;
    result = 31 * result + (int)death;
    result = 31 * result + (int)total;
    result = 31 * result + (lastUpdateEt != null ? lastUpdateEt.hashCode() : 0);
    result = 31 * result + (checkTimeEt != null ? checkTimeEt.hashCode() : 0);
    result = 31 * result + (dateModified != null ? dateModified.hashCode() : 0);
    result = 31 * result + (dateChecked != null ? dateChecked.hashCode() : 0);
    result = 31 * result + (notes != null ? notes.hashCode() : 0);
    result = 31 * result + (int)positive;
    result = 31 * result + (state != null ? state.hashCode() : 0);
    result = 31 * result + (int)totalTestResults;
    result = 31 * result + (int)population;
    return result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    StateTests object = (StateTests) o;

    if (positiveScore != object.positiveScore) return false;
    if (negativeScore != object.negativeScore) return false;
    if (negativeRegularScore != object.negativeRegularScore) return false;
    if (commercialScore != object.commercialScore) return false;
    if (grade != null ? !grade.equals(object.grade) : object.grade != null) return false;
    if (score != object.score) return false;
    if (negative != object.negative) return false;
    if (pending != object.pending) return false;
    if (hospitalized != object.hospitalized) return false;
    if (death != object.death) return false;
    if (total != object.total) return false;
    if (lastUpdateEt != null ? !lastUpdateEt.equals(object.lastUpdateEt) : object.lastUpdateEt != null) return false;
    if (checkTimeEt != null ? !checkTimeEt.equals(object.checkTimeEt) : object.checkTimeEt != null) return false;
    if (dateModified != null ? !dateModified.equals(object.dateModified) : object.dateModified != null) return false;
    if (dateChecked != null ? !dateChecked.equals(object.dateChecked) : object.dateChecked != null) return false;
    if (notes != null ? !notes.equals(object.notes) : object.notes != null) return false;
    if (positive != object.positive) return false;
    if (state != null ? !state.equals(object.state) : object.state != null) return false;
    if (totalTestResults != object.totalTestResults) return false;
    return !(population != object.population);
  }

  @Override
  public String toString() {
    return "StateTests{" +
      "positiveScore = " + getPositiveScore() +
      ", negativeScore = " + getNegativeScore() +
      ", negativeRegularScore = " + getNegativeRegularScore() +
      ", commercialScore = " + getCommercialScore() +
      ", grade = " + getGrade() +
      ", score = " + getScore() +
      ", negative = " + getNegative() +
      ", pending = " + getPending() +
      ", hospitalized = " + getHospitalized() +
      ", death = " + getDeath() +
      ", total = " + getTotal() +
      ", lastUpdateEt = " + getLastUpdateEt() +
      ", checkTimeEt = " + getCheckTimeEt() +
      ", dateModified = " + getDateModified() +
      ", dateChecked = " + getDateChecked() +
      ", notes = " + getNotes() +
      ", positive = " + getPositive() +
      ", state = " + getState() +
      ", totalTestResults = " + getTotalTestResults() +
      ", population = " + getPopulation() +
      "}";
  }

}





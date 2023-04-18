package AirportProblem;

import java.util.List;
import java.util.Objects;

public class SecurityCheckpoint extends Terminal {
  private String checkpointNumber;
  private int maxOfficers;
  private int maxCapacity;
  private boolean isScannerAvailable;
  private boolean isMetalDetectorAvailable;


  /**This is the SecurityCheckpoint class and its parent arguments are inherited to its constructor
   * it has its getters and setters for its arguments below
   * @param checkpointNumber how many checkpoint is thereat the terminal
   * @param maxOfficers max officers at that terminal security checkpoint
   * @param maxCapacity1 max capacity of the terminal security checkpoint
   * @param isScannerAvailable are there scanners at the secuirty checkpoint
   * @param isMetalDetectorAvailable are there metal detectors at the security checkpoint
   */
  public SecurityCheckpoint(String name, String location, int numRunways,
      String airportCode, String airlines, int numTerminals, boolean isInternational,
      String terminalName, int numOfGates, boolean isTerminalInternational, int maxCapacity,
      String amenities, double sizeInSquareFeet, String flights, String checkpointNumber,
      int maxOfficers, int maxCapacity1, boolean isScannerAvailable,
      boolean isMetalDetectorAvailable) {
    super(name, location, numRunways, airportCode, airlines, numTerminals, isInternational,
        terminalName, numOfGates, isTerminalInternational, maxCapacity, amenities, sizeInSquareFeet,
        flights);
    this.checkpointNumber = checkpointNumber;
    this.maxOfficers = maxOfficers;
    this.maxCapacity = maxCapacity1;
    this.isScannerAvailable = isScannerAvailable;
    this.isMetalDetectorAvailable = isMetalDetectorAvailable;
  }


  public String getCheckpointNumber() {
    return checkpointNumber;
  }

  public void setCheckpointNumber(String checkpointNumber) {
    this.checkpointNumber = checkpointNumber;
  }

  public int getMaxOfficers() {
    return maxOfficers;
  }

  public void setMaxOfficers(int maxOfficers) {
    this.maxOfficers = maxOfficers;
  }

  @Override
  public int getMaxCapacity() {
    return maxCapacity;
  }

  @Override
  public void setMaxCapacity(int maxCapacity) {
    this.maxCapacity = maxCapacity;
  }

  public boolean isScannerAvailable() {
    return isScannerAvailable;
  }

  public void setScannerAvailable(boolean scannerAvailable) {
    isScannerAvailable = scannerAvailable;
  }

  public boolean isMetalDetectorAvailable() {
    return isMetalDetectorAvailable;
  }

  public void setMetalDetectorAvailable(boolean metalDetectorAvailable) {
    isMetalDetectorAvailable = metalDetectorAvailable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof SecurityCheckpoint)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    SecurityCheckpoint that = (SecurityCheckpoint) o;
    return getMaxOfficers() == that.getMaxOfficers() && getMaxCapacity() == that.getMaxCapacity()
        && isScannerAvailable() == that.isScannerAvailable() && isMetalDetectorAvailable() == that
        .isMetalDetectorAvailable() && getCheckpointNumber().equals(that.getCheckpointNumber());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getCheckpointNumber(), getMaxOfficers(), getMaxCapacity(),
        isScannerAvailable(), isMetalDetectorAvailable());
  }
}

package com.laba.solvd.a2.flight;

import com.sun.jdi.connect.spi.ClosedConnectionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class Connection extends com.sun.jdi.connect.spi.Connection {
  private boolean open;
  private OutputStream outputStream;
  private InputStream inputStream;

  public Connection(InputStream inputStream, OutputStream outputStream) {
    this.inputStream = inputStream;
    this.outputStream = outputStream;
    open = true;
  }

  public Connection() {
    // Initialize the outputStream and inputStream based on your specific requirements
  }

  /**
   * Reads a packet from the target VM.
   *
   * <p> Attempts to read a JDWP packet from the target VM.
   * A read operation may block indefinitely and only returns when it reads all bytes of a packet,
   * or in the case of a transport service that is based on a stream-oriented communication
   * protocol, the end of stream is encountered.
   *
   * <p> Reading a packet does not do any integrity checking on
   * <p> Returns a byte array of a length equal to the length
   *
   * <p> This method may be invoked at any time.  If another thread has
   * already initiated a {@link #readPacket readPacket} on this connection then the invocation of
   * this method will block until the first operation is complete.
   *
   * @return the packet read from the target VM
   * @throws ClosedConnectionException If the connection is closed, or another thread closes the
   *                                   connection while the readPacket is in progress.
   * @throws IOException               If the length of the packet (as indictaed by the first 4
   *                                   bytes) is less than 11 bytes, or an I/O error occurs.
   */
  @Override
  public byte[] readPacket() throws IOException {
    byte[] buffer = new byte[1024];
    int bytesRead = inputStream.read(buffer);
    return bytesRead > 0 ? Arrays.copyOf(buffer, bytesRead) : new byte[0];
  }

  /**
   * Writes a packet to the target VM.
   *
   * <p> Attempts to write, or send, a JDWP packet to the target VM.
   * A write operation only returns after writing the entire packet to the target VM. Writing the
   * entire packet does not mean the entire packet has been transmitted to the target VM but rather
   * that all bytes have been written to the transport service. A transport service based on a
   * TCP/IP connection may, for example, buffer some or all of the packet before transmission on the
   * network.
   *
   * <p> The byte array provided to this method should be laid out
   *
   * <p> Writing a packet does not do any integrity checking on
   *
   * <p> A write operation may block or may complete immediately..
   *
   * <p> This method may be invoked at any time.  If another thread has
   * already initiated a write operation upon this Connection then a subsequent invocation of this
   * method will block until the first operation is complete.
   *
   * @param pkt The packet to write to the target VM.
   * @throws ClosedConnectionException If the connection is closed, or another thread closes the
   *                                   connection while the write operation is in progress.
   * @throws IOException               If an I/O error occurs.
   * @throws IllegalArgumentException  If the value of the {@code length} field is invalid, or the
   *                                   byte array is of insufficient length.
   */
  @Override
  public void writePacket(byte[] pkt) throws IOException {
    outputStream.write(pkt);
    outputStream.flush();

  }

  /**
   * Closes this connection.
   *
   * <p> If the connection is already closed then invoking this method
   * has no effect. After a connection is closed, any further attempt calls to {@link #readPacket
   * readPacket} or {@link #writePacket writePacket} will throw a {@link
   * ClosedConnectionException}.
   *
   * <p> Any thread currently blocked in an I/O operation ({@link
   * #readPacket readPacket} or {@link #writePacket writePacket}) will throw a {@link
   * ClosedConnectionException}).
   *
   * <p> This method may be invoked at any time.  If some other thread has
   * already invoked it, however, then another invocation will block until the first invocation is
   * complete, after which it will return without effect.
   *
   * @throws IOException If an I/O error occurs
   */
  @Override
  public void close() throws IOException {
    open = false;
    inputStream.close();
    outputStream.close();

  }

  /**
   * Tells whether or not this connection is open.
   *
   * @return {@code true} if and only if this connection is open
   */
  @Override
  public boolean isOpen() {
    return open;
  }
}

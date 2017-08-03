package org.synechron.petstay.model;
// Generated Jul 31, 2017 4:06:11 PM by Hibernate Tools 5.2.3.Final

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Booking generated by hbm2java
 */
@Entity
@Table(name = "booking", catalog = "petdb")
public class Booking implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idbooking;
	private Bookingtype bookingtype;
	private Dog dog;
	private Integer duration;
	private Float totalBill;
	private Byte isCancelled;
	private Byte isConfirmed;
	private Serializable locationFrom;
	private Serializable locationTo;
	private Date actualCheckIn;
	private Date actualCheckOut;
	private Set<Cab> cabs = new HashSet<Cab>();
	private Set<Home> homes = new HashSet<Home>();

	public Booking() {
	}

	public Booking(Bookingtype bookingtype, Dog dog, Integer duration, Float totalBill, Byte isCancelled,
			Byte isConfirmed, Serializable locationFrom, Serializable locationTo, Date actualCheckIn,
			Date actualCheckOut, Set<Cab> cabs, Set<Home> homes) {
		this.bookingtype = bookingtype;
		this.dog = dog;
		this.duration = duration;
		this.totalBill = totalBill;
		this.isCancelled = isCancelled;
		this.isConfirmed = isConfirmed;
		this.locationFrom = locationFrom;
		this.locationTo = locationTo;
		this.actualCheckIn = actualCheckIn;
		this.actualCheckOut = actualCheckOut;
		this.cabs = cabs;
		this.homes = homes;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idbooking", unique = true, nullable = false)
	public Integer getIdbooking() {
		return this.idbooking;
	}

	public void setIdbooking(Integer idbooking) {
		this.idbooking = idbooking;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "booking_type_id")
	public Bookingtype getBookingtype() {
		return this.bookingtype;
	}

	public void setBookingtype(Bookingtype bookingtype) {
		this.bookingtype = bookingtype;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "booking_dog_id")
	public Dog getDog() {
		return this.dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	@Column(name = "duration")
	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	@Column(name = "totalBill", precision = 12, scale = 0)
	public Float getTotalBill() {
		return this.totalBill;
	}

	public void setTotalBill(Float totalBill) {
		this.totalBill = totalBill;
	}

	@Column(name = "isCancelled")
	public Byte getIsCancelled() {
		return this.isCancelled;
	}

	public void setIsCancelled(Byte isCancelled) {
		this.isCancelled = isCancelled;
	}

	@Column(name = "isConfirmed")
	public Byte getIsConfirmed() {
		return this.isConfirmed;
	}

	public void setIsConfirmed(Byte isConfirmed) {
		this.isConfirmed = isConfirmed;
	}

	@Column(name = "locationFrom")
	public Serializable getLocationFrom() {
		return this.locationFrom;
	}

	public void setLocationFrom(Serializable locationFrom) {
		this.locationFrom = locationFrom;
	}

	@Column(name = "locationTo")
	public Serializable getLocationTo() {
		return this.locationTo;
	}

	public void setLocationTo(Serializable locationTo) {
		this.locationTo = locationTo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "actualCheckIn", length = 19)
	public Date getActualCheckIn() {
		return this.actualCheckIn;
	}

	public void setActualCheckIn(Date actualCheckIn) {
		this.actualCheckIn = actualCheckIn;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "actualCheckOut", length = 19)
	public Date getActualCheckOut() {
		return this.actualCheckOut;
	}

	public void setActualCheckOut(Date actualCheckOut) {
		this.actualCheckOut = actualCheckOut;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "booking")
	public Set<Cab> getCabs() {
		return this.cabs;
	}

	public void setCabs(Set<Cab> cabs) {
		this.cabs = cabs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "booking")
	public Set<Home> getHomes() {
		return this.homes;
	}

	public void setHomes(Set<Home> homes) {
		this.homes = homes;
	}

}

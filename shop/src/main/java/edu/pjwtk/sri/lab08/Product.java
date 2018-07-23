/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.pjwtk.sri.lab08;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-06-15")
public class Product implements org.apache.thrift.TBase<Product, Product._Fields>, java.io.Serializable, Cloneable, Comparable<Product> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Product");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PRICE_FIELD_DESC = new org.apache.thrift.protocol.TField("price", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField AMOUNT_OF_STOCK_FIELD_DESC = new org.apache.thrift.protocol.TField("amount_of_stock", org.apache.thrift.protocol.TType.I16, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ProductStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ProductTupleSchemeFactory();

  public int id; // required
  public java.lang.String name; // required
  public double price; // required
  public short amount_of_stock; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    NAME((short)2, "name"),
    PRICE((short)3, "price"),
    AMOUNT_OF_STOCK((short)4, "amount_of_stock");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // NAME
          return NAME;
        case 3: // PRICE
          return PRICE;
        case 4: // AMOUNT_OF_STOCK
          return AMOUNT_OF_STOCK;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ID_ISSET_ID = 0;
  private static final int __PRICE_ISSET_ID = 1;
  private static final int __AMOUNT_OF_STOCK_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PRICE, new org.apache.thrift.meta_data.FieldMetaData("price", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.AMOUNT_OF_STOCK, new org.apache.thrift.meta_data.FieldMetaData("amount_of_stock", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Product.class, metaDataMap);
  }

  public Product() {
  }

  public Product(
    int id,
    java.lang.String name,
    double price,
    short amount_of_stock)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.name = name;
    this.price = price;
    setPriceIsSet(true);
    this.amount_of_stock = amount_of_stock;
    setAmount_of_stockIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Product(Product other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetName()) {
      this.name = other.name;
    }
    this.price = other.price;
    this.amount_of_stock = other.amount_of_stock;
  }

  public Product deepCopy() {
    return new Product(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.name = null;
    setPriceIsSet(false);
    this.price = 0.0;
    setAmount_of_stockIsSet(false);
    this.amount_of_stock = 0;
  }

  public int getId() {
    return this.id;
  }

  public Product setId(int id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public java.lang.String getName() {
    return this.name;
  }

  public Product setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public double getPrice() {
    return this.price;
  }

  public Product setPrice(double price) {
    this.price = price;
    setPriceIsSet(true);
    return this;
  }

  public void unsetPrice() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PRICE_ISSET_ID);
  }

  /** Returns true if field price is set (has been assigned a value) and false otherwise */
  public boolean isSetPrice() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PRICE_ISSET_ID);
  }

  public void setPriceIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PRICE_ISSET_ID, value);
  }

  public short getAmount_of_stock() {
    return this.amount_of_stock;
  }

  public Product setAmount_of_stock(short amount_of_stock) {
    this.amount_of_stock = amount_of_stock;
    setAmount_of_stockIsSet(true);
    return this;
  }

  public void unsetAmount_of_stock() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __AMOUNT_OF_STOCK_ISSET_ID);
  }

  /** Returns true if field amount_of_stock is set (has been assigned a value) and false otherwise */
  public boolean isSetAmount_of_stock() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __AMOUNT_OF_STOCK_ISSET_ID);
  }

  public void setAmount_of_stockIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __AMOUNT_OF_STOCK_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.Integer)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case PRICE:
      if (value == null) {
        unsetPrice();
      } else {
        setPrice((java.lang.Double)value);
      }
      break;

    case AMOUNT_OF_STOCK:
      if (value == null) {
        unsetAmount_of_stock();
      } else {
        setAmount_of_stock((java.lang.Short)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case NAME:
      return getName();

    case PRICE:
      return getPrice();

    case AMOUNT_OF_STOCK:
      return getAmount_of_stock();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case NAME:
      return isSetName();
    case PRICE:
      return isSetPrice();
    case AMOUNT_OF_STOCK:
      return isSetAmount_of_stock();
    }
    throw new java.lang.IllegalStateException();
  }

//  @Override
//  public boolean equals(java.lang.Object that) {
//    if (that == null)
//      return false;
//    if (that instanceof Product)
//      return this.equals((Product)that);
//    return false;
//  }
//
//  public boolean equals(Product that) {
//    if (that == null)
//      return false;
//    if (this == that)
//      return true;
//
//    boolean this_present_id = true;
//    boolean that_present_id = true;
//    if (this_present_id || that_present_id) {
//      if (!(this_present_id && that_present_id))
//        return false;
//      if (this.id != that.id)
//        return false;
//    }
//
//    boolean this_present_name = true && this.isSetName();
//    boolean that_present_name = true && that.isSetName();
//    if (this_present_name || that_present_name) {
//      if (!(this_present_name && that_present_name))
//        return false;
//      if (!this.name.equals(that.name))
//        return false;
//    }
//
//    boolean this_present_price = true;
//    boolean that_present_price = true;
//    if (this_present_price || that_present_price) {
//      if (!(this_present_price && that_present_price))
//        return false;
//      if (this.price != that.price)
//        return false;
//    }
//
//    boolean this_present_amount_of_stock = true;
//    boolean that_present_amount_of_stock = true;
//    if (this_present_amount_of_stock || that_present_amount_of_stock) {
//      if (!(this_present_amount_of_stock && that_present_amount_of_stock))
//        return false;
//      if (this.amount_of_stock != that.amount_of_stock)
//        return false;
//    }
//
//    return true;
//  }
//
//  @Override
//  public int hashCode() {
//    int hashCode = 1;
//
//    hashCode = hashCode * 8191 + id;
//
//    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
//    if (isSetName())
//      hashCode = hashCode * 8191 + name.hashCode();
//
//    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(price);
//
//    hashCode = hashCode * 8191 + amount_of_stock;
//
//    return hashCode;
//  }

  @Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + amount_of_stock;
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	long temp;
	temp = Double.doubleToLongBits(price);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Product other = (Product) obj;
	if (amount_of_stock != other.amount_of_stock)
		return false;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
		return false;
	return true;
}

@Override
  public int compareTo(Product other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPrice()).compareTo(other.isSetPrice());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrice()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.price, other.price);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAmount_of_stock()).compareTo(other.isSetAmount_of_stock());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAmount_of_stock()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.amount_of_stock, other.amount_of_stock);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Product(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("price:");
    sb.append(this.price);
    first = false;
    if (!first) sb.append(", ");
    sb.append("amount_of_stock:");
    sb.append(this.amount_of_stock);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'id' because it's a primitive and you chose the non-beans generator.
    if (name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'name' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'price' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'amount_of_stock' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ProductStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ProductStandardScheme getScheme() {
      return new ProductStandardScheme();
    }
  }

  private static class ProductStandardScheme extends org.apache.thrift.scheme.StandardScheme<Product> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Product struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.id = iprot.readI32();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PRICE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.price = iprot.readDouble();
              struct.setPriceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // AMOUNT_OF_STOCK
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.amount_of_stock = iprot.readI16();
              struct.setAmount_of_stockIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'id' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetPrice()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'price' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetAmount_of_stock()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'amount_of_stock' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Product struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI32(struct.id);
      oprot.writeFieldEnd();
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PRICE_FIELD_DESC);
      oprot.writeDouble(struct.price);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(AMOUNT_OF_STOCK_FIELD_DESC);
      oprot.writeI16(struct.amount_of_stock);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ProductTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ProductTupleScheme getScheme() {
      return new ProductTupleScheme();
    }
  }

  private static class ProductTupleScheme extends org.apache.thrift.scheme.TupleScheme<Product> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Product struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.id);
      oprot.writeString(struct.name);
      oprot.writeDouble(struct.price);
      oprot.writeI16(struct.amount_of_stock);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Product struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.id = iprot.readI32();
      struct.setIdIsSet(true);
      struct.name = iprot.readString();
      struct.setNameIsSet(true);
      struct.price = iprot.readDouble();
      struct.setPriceIsSet(true);
      struct.amount_of_stock = iprot.readI16();
      struct.setAmount_of_stockIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

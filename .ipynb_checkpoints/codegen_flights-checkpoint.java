// ORM class for table 'flights'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sun Apr 20 16:33:18 MSK 2025
// For connector: org.apache.sqoop.manager.PostgresqlManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import org.apache.sqoop.lib.JdbcWritableBridge;
import org.apache.sqoop.lib.DelimiterSet;
import org.apache.sqoop.lib.FieldFormatter;
import org.apache.sqoop.lib.RecordParser;
import org.apache.sqoop.lib.BooleanParser;
import org.apache.sqoop.lib.BlobRef;
import org.apache.sqoop.lib.ClobRef;
import org.apache.sqoop.lib.LargeObjectLoader;
import org.apache.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class codegen_flights extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("fl_date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_flights.this.fl_date = (java.sql.Date)value;
      }
    });
    setters.put("airline", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_flights.this.airline = (String)value;
      }
    });
    setters.put("airline_dot", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_flights.this.airline_dot = (String)value;
      }
    });
    setters.put("airline_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_flights.this.airline_code = (String)value;
      }
    });
    setters.put("dot_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_flights.this.dot_code = (Integer)value;
      }
    });
    setters.put("fl_number", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_flights.this.fl_number = (Integer)value;
      }
    });
    setters.put("origin", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_flights.this.origin = (String)value;
      }
    });
    setters.put("origin_city", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_flights.this.origin_city = (String)value;
      }
    });
    setters.put("dest", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_flights.this.dest = (String)value;
      }
    });
    setters.put("dest_city", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_flights.this.dest_city = (String)value;
      }
    });
    setters.put("crs_dep_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_flights.this.crs_dep_time = (Integer)value;
      }
    });
    setters.put("dep_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_flights.this.dep_time = (Double)value;
      }
    });
    setters.put("dep_delay", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_flights.this.dep_delay = (Double)value;
      }
    });
    setters.put("taxi_out", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_flights.this.taxi_out = (Double)value;
      }
    });
    setters.put("wheels_off", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_flights.this.wheels_off = (Double)value;
      }
    });
    setters.put("wheels_on", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_flights.this.wheels_on = (Double)value;
      }
    });
    setters.put("taxi_in", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_flights.this.taxi_in = (Double)value;
      }
    });
    setters.put("crs_arr_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_flights.this.crs_arr_time = (Integer)value;
      }
    });
    setters.put("arr_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_flights.this.arr_time = (Double)value;
      }
    });
    setters.put("arr_delay", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_flights.this.arr_delay = (Double)value;
      }
    });
    setters.put("cancelled", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_flights.this.cancelled = (Double)value;
      }
    });
    setters.put("cancellation_code", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_flights.this.cancellation_code = (String)value;
      }
    });
    setters.put("diverted", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_flights.this.diverted = (Double)value;
      }
    });
    setters.put("crs_elapsed_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_flights.this.crs_elapsed_time = (Double)value;
      }
    });
    setters.put("elapsed_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_flights.this.elapsed_time = (Double)value;
      }
    });
    setters.put("air_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_flights.this.air_time = (Double)value;
      }
    });
    setters.put("distance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_flights.this.distance = (Double)value;
      }
    });
    setters.put("delay_due_carrier", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_flights.this.delay_due_carrier = (Double)value;
      }
    });
    setters.put("delay_due_weather", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_flights.this.delay_due_weather = (Double)value;
      }
    });
    setters.put("delay_due_nas", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_flights.this.delay_due_nas = (Double)value;
      }
    });
    setters.put("delay_due_security", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_flights.this.delay_due_security = (Double)value;
      }
    });
    setters.put("delay_due_late_aircraft", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_flights.this.delay_due_late_aircraft = (Double)value;
      }
    });
  }
  public codegen_flights() {
    init0();
  }
  private java.sql.Date fl_date;
  public java.sql.Date get_fl_date() {
    return fl_date;
  }
  public void set_fl_date(java.sql.Date fl_date) {
    this.fl_date = fl_date;
  }
  public codegen_flights with_fl_date(java.sql.Date fl_date) {
    this.fl_date = fl_date;
    return this;
  }
  private String airline;
  public String get_airline() {
    return airline;
  }
  public void set_airline(String airline) {
    this.airline = airline;
  }
  public codegen_flights with_airline(String airline) {
    this.airline = airline;
    return this;
  }
  private String airline_dot;
  public String get_airline_dot() {
    return airline_dot;
  }
  public void set_airline_dot(String airline_dot) {
    this.airline_dot = airline_dot;
  }
  public codegen_flights with_airline_dot(String airline_dot) {
    this.airline_dot = airline_dot;
    return this;
  }
  private String airline_code;
  public String get_airline_code() {
    return airline_code;
  }
  public void set_airline_code(String airline_code) {
    this.airline_code = airline_code;
  }
  public codegen_flights with_airline_code(String airline_code) {
    this.airline_code = airline_code;
    return this;
  }
  private Integer dot_code;
  public Integer get_dot_code() {
    return dot_code;
  }
  public void set_dot_code(Integer dot_code) {
    this.dot_code = dot_code;
  }
  public codegen_flights with_dot_code(Integer dot_code) {
    this.dot_code = dot_code;
    return this;
  }
  private Integer fl_number;
  public Integer get_fl_number() {
    return fl_number;
  }
  public void set_fl_number(Integer fl_number) {
    this.fl_number = fl_number;
  }
  public codegen_flights with_fl_number(Integer fl_number) {
    this.fl_number = fl_number;
    return this;
  }
  private String origin;
  public String get_origin() {
    return origin;
  }
  public void set_origin(String origin) {
    this.origin = origin;
  }
  public codegen_flights with_origin(String origin) {
    this.origin = origin;
    return this;
  }
  private String origin_city;
  public String get_origin_city() {
    return origin_city;
  }
  public void set_origin_city(String origin_city) {
    this.origin_city = origin_city;
  }
  public codegen_flights with_origin_city(String origin_city) {
    this.origin_city = origin_city;
    return this;
  }
  private String dest;
  public String get_dest() {
    return dest;
  }
  public void set_dest(String dest) {
    this.dest = dest;
  }
  public codegen_flights with_dest(String dest) {
    this.dest = dest;
    return this;
  }
  private String dest_city;
  public String get_dest_city() {
    return dest_city;
  }
  public void set_dest_city(String dest_city) {
    this.dest_city = dest_city;
  }
  public codegen_flights with_dest_city(String dest_city) {
    this.dest_city = dest_city;
    return this;
  }
  private Integer crs_dep_time;
  public Integer get_crs_dep_time() {
    return crs_dep_time;
  }
  public void set_crs_dep_time(Integer crs_dep_time) {
    this.crs_dep_time = crs_dep_time;
  }
  public codegen_flights with_crs_dep_time(Integer crs_dep_time) {
    this.crs_dep_time = crs_dep_time;
    return this;
  }
  private Double dep_time;
  public Double get_dep_time() {
    return dep_time;
  }
  public void set_dep_time(Double dep_time) {
    this.dep_time = dep_time;
  }
  public codegen_flights with_dep_time(Double dep_time) {
    this.dep_time = dep_time;
    return this;
  }
  private Double dep_delay;
  public Double get_dep_delay() {
    return dep_delay;
  }
  public void set_dep_delay(Double dep_delay) {
    this.dep_delay = dep_delay;
  }
  public codegen_flights with_dep_delay(Double dep_delay) {
    this.dep_delay = dep_delay;
    return this;
  }
  private Double taxi_out;
  public Double get_taxi_out() {
    return taxi_out;
  }
  public void set_taxi_out(Double taxi_out) {
    this.taxi_out = taxi_out;
  }
  public codegen_flights with_taxi_out(Double taxi_out) {
    this.taxi_out = taxi_out;
    return this;
  }
  private Double wheels_off;
  public Double get_wheels_off() {
    return wheels_off;
  }
  public void set_wheels_off(Double wheels_off) {
    this.wheels_off = wheels_off;
  }
  public codegen_flights with_wheels_off(Double wheels_off) {
    this.wheels_off = wheels_off;
    return this;
  }
  private Double wheels_on;
  public Double get_wheels_on() {
    return wheels_on;
  }
  public void set_wheels_on(Double wheels_on) {
    this.wheels_on = wheels_on;
  }
  public codegen_flights with_wheels_on(Double wheels_on) {
    this.wheels_on = wheels_on;
    return this;
  }
  private Double taxi_in;
  public Double get_taxi_in() {
    return taxi_in;
  }
  public void set_taxi_in(Double taxi_in) {
    this.taxi_in = taxi_in;
  }
  public codegen_flights with_taxi_in(Double taxi_in) {
    this.taxi_in = taxi_in;
    return this;
  }
  private Integer crs_arr_time;
  public Integer get_crs_arr_time() {
    return crs_arr_time;
  }
  public void set_crs_arr_time(Integer crs_arr_time) {
    this.crs_arr_time = crs_arr_time;
  }
  public codegen_flights with_crs_arr_time(Integer crs_arr_time) {
    this.crs_arr_time = crs_arr_time;
    return this;
  }
  private Double arr_time;
  public Double get_arr_time() {
    return arr_time;
  }
  public void set_arr_time(Double arr_time) {
    this.arr_time = arr_time;
  }
  public codegen_flights with_arr_time(Double arr_time) {
    this.arr_time = arr_time;
    return this;
  }
  private Double arr_delay;
  public Double get_arr_delay() {
    return arr_delay;
  }
  public void set_arr_delay(Double arr_delay) {
    this.arr_delay = arr_delay;
  }
  public codegen_flights with_arr_delay(Double arr_delay) {
    this.arr_delay = arr_delay;
    return this;
  }
  private Double cancelled;
  public Double get_cancelled() {
    return cancelled;
  }
  public void set_cancelled(Double cancelled) {
    this.cancelled = cancelled;
  }
  public codegen_flights with_cancelled(Double cancelled) {
    this.cancelled = cancelled;
    return this;
  }
  private String cancellation_code;
  public String get_cancellation_code() {
    return cancellation_code;
  }
  public void set_cancellation_code(String cancellation_code) {
    this.cancellation_code = cancellation_code;
  }
  public codegen_flights with_cancellation_code(String cancellation_code) {
    this.cancellation_code = cancellation_code;
    return this;
  }
  private Double diverted;
  public Double get_diverted() {
    return diverted;
  }
  public void set_diverted(Double diverted) {
    this.diverted = diverted;
  }
  public codegen_flights with_diverted(Double diverted) {
    this.diverted = diverted;
    return this;
  }
  private Double crs_elapsed_time;
  public Double get_crs_elapsed_time() {
    return crs_elapsed_time;
  }
  public void set_crs_elapsed_time(Double crs_elapsed_time) {
    this.crs_elapsed_time = crs_elapsed_time;
  }
  public codegen_flights with_crs_elapsed_time(Double crs_elapsed_time) {
    this.crs_elapsed_time = crs_elapsed_time;
    return this;
  }
  private Double elapsed_time;
  public Double get_elapsed_time() {
    return elapsed_time;
  }
  public void set_elapsed_time(Double elapsed_time) {
    this.elapsed_time = elapsed_time;
  }
  public codegen_flights with_elapsed_time(Double elapsed_time) {
    this.elapsed_time = elapsed_time;
    return this;
  }
  private Double air_time;
  public Double get_air_time() {
    return air_time;
  }
  public void set_air_time(Double air_time) {
    this.air_time = air_time;
  }
  public codegen_flights with_air_time(Double air_time) {
    this.air_time = air_time;
    return this;
  }
  private Double distance;
  public Double get_distance() {
    return distance;
  }
  public void set_distance(Double distance) {
    this.distance = distance;
  }
  public codegen_flights with_distance(Double distance) {
    this.distance = distance;
    return this;
  }
  private Double delay_due_carrier;
  public Double get_delay_due_carrier() {
    return delay_due_carrier;
  }
  public void set_delay_due_carrier(Double delay_due_carrier) {
    this.delay_due_carrier = delay_due_carrier;
  }
  public codegen_flights with_delay_due_carrier(Double delay_due_carrier) {
    this.delay_due_carrier = delay_due_carrier;
    return this;
  }
  private Double delay_due_weather;
  public Double get_delay_due_weather() {
    return delay_due_weather;
  }
  public void set_delay_due_weather(Double delay_due_weather) {
    this.delay_due_weather = delay_due_weather;
  }
  public codegen_flights with_delay_due_weather(Double delay_due_weather) {
    this.delay_due_weather = delay_due_weather;
    return this;
  }
  private Double delay_due_nas;
  public Double get_delay_due_nas() {
    return delay_due_nas;
  }
  public void set_delay_due_nas(Double delay_due_nas) {
    this.delay_due_nas = delay_due_nas;
  }
  public codegen_flights with_delay_due_nas(Double delay_due_nas) {
    this.delay_due_nas = delay_due_nas;
    return this;
  }
  private Double delay_due_security;
  public Double get_delay_due_security() {
    return delay_due_security;
  }
  public void set_delay_due_security(Double delay_due_security) {
    this.delay_due_security = delay_due_security;
  }
  public codegen_flights with_delay_due_security(Double delay_due_security) {
    this.delay_due_security = delay_due_security;
    return this;
  }
  private Double delay_due_late_aircraft;
  public Double get_delay_due_late_aircraft() {
    return delay_due_late_aircraft;
  }
  public void set_delay_due_late_aircraft(Double delay_due_late_aircraft) {
    this.delay_due_late_aircraft = delay_due_late_aircraft;
  }
  public codegen_flights with_delay_due_late_aircraft(Double delay_due_late_aircraft) {
    this.delay_due_late_aircraft = delay_due_late_aircraft;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_flights)) {
      return false;
    }
    codegen_flights that = (codegen_flights) o;
    boolean equal = true;
    equal = equal && (this.fl_date == null ? that.fl_date == null : this.fl_date.equals(that.fl_date));
    equal = equal && (this.airline == null ? that.airline == null : this.airline.equals(that.airline));
    equal = equal && (this.airline_dot == null ? that.airline_dot == null : this.airline_dot.equals(that.airline_dot));
    equal = equal && (this.airline_code == null ? that.airline_code == null : this.airline_code.equals(that.airline_code));
    equal = equal && (this.dot_code == null ? that.dot_code == null : this.dot_code.equals(that.dot_code));
    equal = equal && (this.fl_number == null ? that.fl_number == null : this.fl_number.equals(that.fl_number));
    equal = equal && (this.origin == null ? that.origin == null : this.origin.equals(that.origin));
    equal = equal && (this.origin_city == null ? that.origin_city == null : this.origin_city.equals(that.origin_city));
    equal = equal && (this.dest == null ? that.dest == null : this.dest.equals(that.dest));
    equal = equal && (this.dest_city == null ? that.dest_city == null : this.dest_city.equals(that.dest_city));
    equal = equal && (this.crs_dep_time == null ? that.crs_dep_time == null : this.crs_dep_time.equals(that.crs_dep_time));
    equal = equal && (this.dep_time == null ? that.dep_time == null : this.dep_time.equals(that.dep_time));
    equal = equal && (this.dep_delay == null ? that.dep_delay == null : this.dep_delay.equals(that.dep_delay));
    equal = equal && (this.taxi_out == null ? that.taxi_out == null : this.taxi_out.equals(that.taxi_out));
    equal = equal && (this.wheels_off == null ? that.wheels_off == null : this.wheels_off.equals(that.wheels_off));
    equal = equal && (this.wheels_on == null ? that.wheels_on == null : this.wheels_on.equals(that.wheels_on));
    equal = equal && (this.taxi_in == null ? that.taxi_in == null : this.taxi_in.equals(that.taxi_in));
    equal = equal && (this.crs_arr_time == null ? that.crs_arr_time == null : this.crs_arr_time.equals(that.crs_arr_time));
    equal = equal && (this.arr_time == null ? that.arr_time == null : this.arr_time.equals(that.arr_time));
    equal = equal && (this.arr_delay == null ? that.arr_delay == null : this.arr_delay.equals(that.arr_delay));
    equal = equal && (this.cancelled == null ? that.cancelled == null : this.cancelled.equals(that.cancelled));
    equal = equal && (this.cancellation_code == null ? that.cancellation_code == null : this.cancellation_code.equals(that.cancellation_code));
    equal = equal && (this.diverted == null ? that.diverted == null : this.diverted.equals(that.diverted));
    equal = equal && (this.crs_elapsed_time == null ? that.crs_elapsed_time == null : this.crs_elapsed_time.equals(that.crs_elapsed_time));
    equal = equal && (this.elapsed_time == null ? that.elapsed_time == null : this.elapsed_time.equals(that.elapsed_time));
    equal = equal && (this.air_time == null ? that.air_time == null : this.air_time.equals(that.air_time));
    equal = equal && (this.distance == null ? that.distance == null : this.distance.equals(that.distance));
    equal = equal && (this.delay_due_carrier == null ? that.delay_due_carrier == null : this.delay_due_carrier.equals(that.delay_due_carrier));
    equal = equal && (this.delay_due_weather == null ? that.delay_due_weather == null : this.delay_due_weather.equals(that.delay_due_weather));
    equal = equal && (this.delay_due_nas == null ? that.delay_due_nas == null : this.delay_due_nas.equals(that.delay_due_nas));
    equal = equal && (this.delay_due_security == null ? that.delay_due_security == null : this.delay_due_security.equals(that.delay_due_security));
    equal = equal && (this.delay_due_late_aircraft == null ? that.delay_due_late_aircraft == null : this.delay_due_late_aircraft.equals(that.delay_due_late_aircraft));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_flights)) {
      return false;
    }
    codegen_flights that = (codegen_flights) o;
    boolean equal = true;
    equal = equal && (this.fl_date == null ? that.fl_date == null : this.fl_date.equals(that.fl_date));
    equal = equal && (this.airline == null ? that.airline == null : this.airline.equals(that.airline));
    equal = equal && (this.airline_dot == null ? that.airline_dot == null : this.airline_dot.equals(that.airline_dot));
    equal = equal && (this.airline_code == null ? that.airline_code == null : this.airline_code.equals(that.airline_code));
    equal = equal && (this.dot_code == null ? that.dot_code == null : this.dot_code.equals(that.dot_code));
    equal = equal && (this.fl_number == null ? that.fl_number == null : this.fl_number.equals(that.fl_number));
    equal = equal && (this.origin == null ? that.origin == null : this.origin.equals(that.origin));
    equal = equal && (this.origin_city == null ? that.origin_city == null : this.origin_city.equals(that.origin_city));
    equal = equal && (this.dest == null ? that.dest == null : this.dest.equals(that.dest));
    equal = equal && (this.dest_city == null ? that.dest_city == null : this.dest_city.equals(that.dest_city));
    equal = equal && (this.crs_dep_time == null ? that.crs_dep_time == null : this.crs_dep_time.equals(that.crs_dep_time));
    equal = equal && (this.dep_time == null ? that.dep_time == null : this.dep_time.equals(that.dep_time));
    equal = equal && (this.dep_delay == null ? that.dep_delay == null : this.dep_delay.equals(that.dep_delay));
    equal = equal && (this.taxi_out == null ? that.taxi_out == null : this.taxi_out.equals(that.taxi_out));
    equal = equal && (this.wheels_off == null ? that.wheels_off == null : this.wheels_off.equals(that.wheels_off));
    equal = equal && (this.wheels_on == null ? that.wheels_on == null : this.wheels_on.equals(that.wheels_on));
    equal = equal && (this.taxi_in == null ? that.taxi_in == null : this.taxi_in.equals(that.taxi_in));
    equal = equal && (this.crs_arr_time == null ? that.crs_arr_time == null : this.crs_arr_time.equals(that.crs_arr_time));
    equal = equal && (this.arr_time == null ? that.arr_time == null : this.arr_time.equals(that.arr_time));
    equal = equal && (this.arr_delay == null ? that.arr_delay == null : this.arr_delay.equals(that.arr_delay));
    equal = equal && (this.cancelled == null ? that.cancelled == null : this.cancelled.equals(that.cancelled));
    equal = equal && (this.cancellation_code == null ? that.cancellation_code == null : this.cancellation_code.equals(that.cancellation_code));
    equal = equal && (this.diverted == null ? that.diverted == null : this.diverted.equals(that.diverted));
    equal = equal && (this.crs_elapsed_time == null ? that.crs_elapsed_time == null : this.crs_elapsed_time.equals(that.crs_elapsed_time));
    equal = equal && (this.elapsed_time == null ? that.elapsed_time == null : this.elapsed_time.equals(that.elapsed_time));
    equal = equal && (this.air_time == null ? that.air_time == null : this.air_time.equals(that.air_time));
    equal = equal && (this.distance == null ? that.distance == null : this.distance.equals(that.distance));
    equal = equal && (this.delay_due_carrier == null ? that.delay_due_carrier == null : this.delay_due_carrier.equals(that.delay_due_carrier));
    equal = equal && (this.delay_due_weather == null ? that.delay_due_weather == null : this.delay_due_weather.equals(that.delay_due_weather));
    equal = equal && (this.delay_due_nas == null ? that.delay_due_nas == null : this.delay_due_nas.equals(that.delay_due_nas));
    equal = equal && (this.delay_due_security == null ? that.delay_due_security == null : this.delay_due_security.equals(that.delay_due_security));
    equal = equal && (this.delay_due_late_aircraft == null ? that.delay_due_late_aircraft == null : this.delay_due_late_aircraft.equals(that.delay_due_late_aircraft));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.fl_date = JdbcWritableBridge.readDate(1, __dbResults);
    this.airline = JdbcWritableBridge.readString(2, __dbResults);
    this.airline_dot = JdbcWritableBridge.readString(3, __dbResults);
    this.airline_code = JdbcWritableBridge.readString(4, __dbResults);
    this.dot_code = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fl_number = JdbcWritableBridge.readInteger(6, __dbResults);
    this.origin = JdbcWritableBridge.readString(7, __dbResults);
    this.origin_city = JdbcWritableBridge.readString(8, __dbResults);
    this.dest = JdbcWritableBridge.readString(9, __dbResults);
    this.dest_city = JdbcWritableBridge.readString(10, __dbResults);
    this.crs_dep_time = JdbcWritableBridge.readInteger(11, __dbResults);
    this.dep_time = JdbcWritableBridge.readDouble(12, __dbResults);
    this.dep_delay = JdbcWritableBridge.readDouble(13, __dbResults);
    this.taxi_out = JdbcWritableBridge.readDouble(14, __dbResults);
    this.wheels_off = JdbcWritableBridge.readDouble(15, __dbResults);
    this.wheels_on = JdbcWritableBridge.readDouble(16, __dbResults);
    this.taxi_in = JdbcWritableBridge.readDouble(17, __dbResults);
    this.crs_arr_time = JdbcWritableBridge.readInteger(18, __dbResults);
    this.arr_time = JdbcWritableBridge.readDouble(19, __dbResults);
    this.arr_delay = JdbcWritableBridge.readDouble(20, __dbResults);
    this.cancelled = JdbcWritableBridge.readDouble(21, __dbResults);
    this.cancellation_code = JdbcWritableBridge.readString(22, __dbResults);
    this.diverted = JdbcWritableBridge.readDouble(23, __dbResults);
    this.crs_elapsed_time = JdbcWritableBridge.readDouble(24, __dbResults);
    this.elapsed_time = JdbcWritableBridge.readDouble(25, __dbResults);
    this.air_time = JdbcWritableBridge.readDouble(26, __dbResults);
    this.distance = JdbcWritableBridge.readDouble(27, __dbResults);
    this.delay_due_carrier = JdbcWritableBridge.readDouble(28, __dbResults);
    this.delay_due_weather = JdbcWritableBridge.readDouble(29, __dbResults);
    this.delay_due_nas = JdbcWritableBridge.readDouble(30, __dbResults);
    this.delay_due_security = JdbcWritableBridge.readDouble(31, __dbResults);
    this.delay_due_late_aircraft = JdbcWritableBridge.readDouble(32, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.fl_date = JdbcWritableBridge.readDate(1, __dbResults);
    this.airline = JdbcWritableBridge.readString(2, __dbResults);
    this.airline_dot = JdbcWritableBridge.readString(3, __dbResults);
    this.airline_code = JdbcWritableBridge.readString(4, __dbResults);
    this.dot_code = JdbcWritableBridge.readInteger(5, __dbResults);
    this.fl_number = JdbcWritableBridge.readInteger(6, __dbResults);
    this.origin = JdbcWritableBridge.readString(7, __dbResults);
    this.origin_city = JdbcWritableBridge.readString(8, __dbResults);
    this.dest = JdbcWritableBridge.readString(9, __dbResults);
    this.dest_city = JdbcWritableBridge.readString(10, __dbResults);
    this.crs_dep_time = JdbcWritableBridge.readInteger(11, __dbResults);
    this.dep_time = JdbcWritableBridge.readDouble(12, __dbResults);
    this.dep_delay = JdbcWritableBridge.readDouble(13, __dbResults);
    this.taxi_out = JdbcWritableBridge.readDouble(14, __dbResults);
    this.wheels_off = JdbcWritableBridge.readDouble(15, __dbResults);
    this.wheels_on = JdbcWritableBridge.readDouble(16, __dbResults);
    this.taxi_in = JdbcWritableBridge.readDouble(17, __dbResults);
    this.crs_arr_time = JdbcWritableBridge.readInteger(18, __dbResults);
    this.arr_time = JdbcWritableBridge.readDouble(19, __dbResults);
    this.arr_delay = JdbcWritableBridge.readDouble(20, __dbResults);
    this.cancelled = JdbcWritableBridge.readDouble(21, __dbResults);
    this.cancellation_code = JdbcWritableBridge.readString(22, __dbResults);
    this.diverted = JdbcWritableBridge.readDouble(23, __dbResults);
    this.crs_elapsed_time = JdbcWritableBridge.readDouble(24, __dbResults);
    this.elapsed_time = JdbcWritableBridge.readDouble(25, __dbResults);
    this.air_time = JdbcWritableBridge.readDouble(26, __dbResults);
    this.distance = JdbcWritableBridge.readDouble(27, __dbResults);
    this.delay_due_carrier = JdbcWritableBridge.readDouble(28, __dbResults);
    this.delay_due_weather = JdbcWritableBridge.readDouble(29, __dbResults);
    this.delay_due_nas = JdbcWritableBridge.readDouble(30, __dbResults);
    this.delay_due_security = JdbcWritableBridge.readDouble(31, __dbResults);
    this.delay_due_late_aircraft = JdbcWritableBridge.readDouble(32, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(fl_date, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(airline, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(airline_dot, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(airline_code, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(dot_code, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fl_number, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(origin, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(origin_city, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(dest, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(dest_city, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(crs_dep_time, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDouble(dep_time, 12 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(dep_delay, 13 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(taxi_out, 14 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(wheels_off, 15 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(wheels_on, 16 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(taxi_in, 17 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(crs_arr_time, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDouble(arr_time, 19 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(arr_delay, 20 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(cancelled, 21 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(cancellation_code, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(diverted, 23 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(crs_elapsed_time, 24 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(elapsed_time, 25 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(air_time, 26 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(distance, 27 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(delay_due_carrier, 28 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(delay_due_weather, 29 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(delay_due_nas, 30 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(delay_due_security, 31 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(delay_due_late_aircraft, 32 + __off, 8, __dbStmt);
    return 32;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(fl_date, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(airline, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(airline_dot, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(airline_code, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(dot_code, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(fl_number, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(origin, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(origin_city, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(dest, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(dest_city, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(crs_dep_time, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDouble(dep_time, 12 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(dep_delay, 13 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(taxi_out, 14 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(wheels_off, 15 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(wheels_on, 16 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(taxi_in, 17 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(crs_arr_time, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDouble(arr_time, 19 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(arr_delay, 20 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(cancelled, 21 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(cancellation_code, 22 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(diverted, 23 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(crs_elapsed_time, 24 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(elapsed_time, 25 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(air_time, 26 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(distance, 27 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(delay_due_carrier, 28 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(delay_due_weather, 29 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(delay_due_nas, 30 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(delay_due_security, 31 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(delay_due_late_aircraft, 32 + __off, 8, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.fl_date = null;
    } else {
    this.fl_date = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.airline = null;
    } else {
    this.airline = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.airline_dot = null;
    } else {
    this.airline_dot = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.airline_code = null;
    } else {
    this.airline_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.dot_code = null;
    } else {
    this.dot_code = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.fl_number = null;
    } else {
    this.fl_number = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.origin = null;
    } else {
    this.origin = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.origin_city = null;
    } else {
    this.origin_city = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.dest = null;
    } else {
    this.dest = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.dest_city = null;
    } else {
    this.dest_city = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.crs_dep_time = null;
    } else {
    this.crs_dep_time = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.dep_time = null;
    } else {
    this.dep_time = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.dep_delay = null;
    } else {
    this.dep_delay = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.taxi_out = null;
    } else {
    this.taxi_out = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.wheels_off = null;
    } else {
    this.wheels_off = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.wheels_on = null;
    } else {
    this.wheels_on = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.taxi_in = null;
    } else {
    this.taxi_in = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.crs_arr_time = null;
    } else {
    this.crs_arr_time = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.arr_time = null;
    } else {
    this.arr_time = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.arr_delay = null;
    } else {
    this.arr_delay = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.cancelled = null;
    } else {
    this.cancelled = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.cancellation_code = null;
    } else {
    this.cancellation_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.diverted = null;
    } else {
    this.diverted = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.crs_elapsed_time = null;
    } else {
    this.crs_elapsed_time = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.elapsed_time = null;
    } else {
    this.elapsed_time = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.air_time = null;
    } else {
    this.air_time = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.distance = null;
    } else {
    this.distance = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.delay_due_carrier = null;
    } else {
    this.delay_due_carrier = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.delay_due_weather = null;
    } else {
    this.delay_due_weather = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.delay_due_nas = null;
    } else {
    this.delay_due_nas = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.delay_due_security = null;
    } else {
    this.delay_due_security = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.delay_due_late_aircraft = null;
    } else {
    this.delay_due_late_aircraft = Double.valueOf(__dataIn.readDouble());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.fl_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fl_date.getTime());
    }
    if (null == this.airline) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, airline);
    }
    if (null == this.airline_dot) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, airline_dot);
    }
    if (null == this.airline_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, airline_code);
    }
    if (null == this.dot_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.dot_code);
    }
    if (null == this.fl_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fl_number);
    }
    if (null == this.origin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, origin);
    }
    if (null == this.origin_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, origin_city);
    }
    if (null == this.dest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, dest);
    }
    if (null == this.dest_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, dest_city);
    }
    if (null == this.crs_dep_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.crs_dep_time);
    }
    if (null == this.dep_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.dep_time);
    }
    if (null == this.dep_delay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.dep_delay);
    }
    if (null == this.taxi_out) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.taxi_out);
    }
    if (null == this.wheels_off) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.wheels_off);
    }
    if (null == this.wheels_on) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.wheels_on);
    }
    if (null == this.taxi_in) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.taxi_in);
    }
    if (null == this.crs_arr_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.crs_arr_time);
    }
    if (null == this.arr_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.arr_time);
    }
    if (null == this.arr_delay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.arr_delay);
    }
    if (null == this.cancelled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.cancelled);
    }
    if (null == this.cancellation_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cancellation_code);
    }
    if (null == this.diverted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.diverted);
    }
    if (null == this.crs_elapsed_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.crs_elapsed_time);
    }
    if (null == this.elapsed_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.elapsed_time);
    }
    if (null == this.air_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.air_time);
    }
    if (null == this.distance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.distance);
    }
    if (null == this.delay_due_carrier) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.delay_due_carrier);
    }
    if (null == this.delay_due_weather) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.delay_due_weather);
    }
    if (null == this.delay_due_nas) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.delay_due_nas);
    }
    if (null == this.delay_due_security) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.delay_due_security);
    }
    if (null == this.delay_due_late_aircraft) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.delay_due_late_aircraft);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.fl_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.fl_date.getTime());
    }
    if (null == this.airline) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, airline);
    }
    if (null == this.airline_dot) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, airline_dot);
    }
    if (null == this.airline_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, airline_code);
    }
    if (null == this.dot_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.dot_code);
    }
    if (null == this.fl_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.fl_number);
    }
    if (null == this.origin) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, origin);
    }
    if (null == this.origin_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, origin_city);
    }
    if (null == this.dest) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, dest);
    }
    if (null == this.dest_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, dest_city);
    }
    if (null == this.crs_dep_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.crs_dep_time);
    }
    if (null == this.dep_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.dep_time);
    }
    if (null == this.dep_delay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.dep_delay);
    }
    if (null == this.taxi_out) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.taxi_out);
    }
    if (null == this.wheels_off) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.wheels_off);
    }
    if (null == this.wheels_on) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.wheels_on);
    }
    if (null == this.taxi_in) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.taxi_in);
    }
    if (null == this.crs_arr_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.crs_arr_time);
    }
    if (null == this.arr_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.arr_time);
    }
    if (null == this.arr_delay) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.arr_delay);
    }
    if (null == this.cancelled) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.cancelled);
    }
    if (null == this.cancellation_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cancellation_code);
    }
    if (null == this.diverted) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.diverted);
    }
    if (null == this.crs_elapsed_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.crs_elapsed_time);
    }
    if (null == this.elapsed_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.elapsed_time);
    }
    if (null == this.air_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.air_time);
    }
    if (null == this.distance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.distance);
    }
    if (null == this.delay_due_carrier) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.delay_due_carrier);
    }
    if (null == this.delay_due_weather) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.delay_due_weather);
    }
    if (null == this.delay_due_nas) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.delay_due_nas);
    }
    if (null == this.delay_due_security) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.delay_due_security);
    }
    if (null == this.delay_due_late_aircraft) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.delay_due_late_aircraft);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(fl_date==null?"null":"" + fl_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(airline==null?"null":airline, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(airline_dot==null?"null":airline_dot, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(airline_code==null?"null":airline_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dot_code==null?"null":"" + dot_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fl_number==null?"null":"" + fl_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(origin==null?"null":origin, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(origin_city==null?"null":origin_city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dest==null?"null":dest, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dest_city==null?"null":dest_city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(crs_dep_time==null?"null":"" + crs_dep_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dep_time==null?"null":"" + dep_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dep_delay==null?"null":"" + dep_delay, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(taxi_out==null?"null":"" + taxi_out, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(wheels_off==null?"null":"" + wheels_off, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(wheels_on==null?"null":"" + wheels_on, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(taxi_in==null?"null":"" + taxi_in, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(crs_arr_time==null?"null":"" + crs_arr_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(arr_time==null?"null":"" + arr_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(arr_delay==null?"null":"" + arr_delay, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cancelled==null?"null":"" + cancelled, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cancellation_code==null?"null":cancellation_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(diverted==null?"null":"" + diverted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(crs_elapsed_time==null?"null":"" + crs_elapsed_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(elapsed_time==null?"null":"" + elapsed_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(air_time==null?"null":"" + air_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(distance==null?"null":"" + distance, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(delay_due_carrier==null?"null":"" + delay_due_carrier, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(delay_due_weather==null?"null":"" + delay_due_weather, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(delay_due_nas==null?"null":"" + delay_due_nas, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(delay_due_security==null?"null":"" + delay_due_security, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(delay_due_late_aircraft==null?"null":"" + delay_due_late_aircraft, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(fl_date==null?"null":"" + fl_date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(airline==null?"null":airline, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(airline_dot==null?"null":airline_dot, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(airline_code==null?"null":airline_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dot_code==null?"null":"" + dot_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(fl_number==null?"null":"" + fl_number, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(origin==null?"null":origin, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(origin_city==null?"null":origin_city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dest==null?"null":dest, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dest_city==null?"null":dest_city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(crs_dep_time==null?"null":"" + crs_dep_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dep_time==null?"null":"" + dep_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dep_delay==null?"null":"" + dep_delay, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(taxi_out==null?"null":"" + taxi_out, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(wheels_off==null?"null":"" + wheels_off, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(wheels_on==null?"null":"" + wheels_on, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(taxi_in==null?"null":"" + taxi_in, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(crs_arr_time==null?"null":"" + crs_arr_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(arr_time==null?"null":"" + arr_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(arr_delay==null?"null":"" + arr_delay, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cancelled==null?"null":"" + cancelled, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cancellation_code==null?"null":cancellation_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(diverted==null?"null":"" + diverted, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(crs_elapsed_time==null?"null":"" + crs_elapsed_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(elapsed_time==null?"null":"" + elapsed_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(air_time==null?"null":"" + air_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(distance==null?"null":"" + distance, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(delay_due_carrier==null?"null":"" + delay_due_carrier, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(delay_due_weather==null?"null":"" + delay_due_weather, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(delay_due_nas==null?"null":"" + delay_due_nas, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(delay_due_security==null?"null":"" + delay_due_security, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(delay_due_late_aircraft==null?"null":"" + delay_due_late_aircraft, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fl_date = null; } else {
      this.fl_date = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.airline = null; } else {
      this.airline = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.airline_dot = null; } else {
      this.airline_dot = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.airline_code = null; } else {
      this.airline_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.dot_code = null; } else {
      this.dot_code = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fl_number = null; } else {
      this.fl_number = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.origin = null; } else {
      this.origin = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.origin_city = null; } else {
      this.origin_city = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.dest = null; } else {
      this.dest = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.dest_city = null; } else {
      this.dest_city = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.crs_dep_time = null; } else {
      this.crs_dep_time = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.dep_time = null; } else {
      this.dep_time = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.dep_delay = null; } else {
      this.dep_delay = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.taxi_out = null; } else {
      this.taxi_out = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.wheels_off = null; } else {
      this.wheels_off = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.wheels_on = null; } else {
      this.wheels_on = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.taxi_in = null; } else {
      this.taxi_in = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.crs_arr_time = null; } else {
      this.crs_arr_time = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.arr_time = null; } else {
      this.arr_time = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.arr_delay = null; } else {
      this.arr_delay = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cancelled = null; } else {
      this.cancelled = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.cancellation_code = null; } else {
      this.cancellation_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.diverted = null; } else {
      this.diverted = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.crs_elapsed_time = null; } else {
      this.crs_elapsed_time = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.elapsed_time = null; } else {
      this.elapsed_time = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.air_time = null; } else {
      this.air_time = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.distance = null; } else {
      this.distance = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.delay_due_carrier = null; } else {
      this.delay_due_carrier = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.delay_due_weather = null; } else {
      this.delay_due_weather = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.delay_due_nas = null; } else {
      this.delay_due_nas = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.delay_due_security = null; } else {
      this.delay_due_security = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.delay_due_late_aircraft = null; } else {
      this.delay_due_late_aircraft = Double.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fl_date = null; } else {
      this.fl_date = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.airline = null; } else {
      this.airline = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.airline_dot = null; } else {
      this.airline_dot = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.airline_code = null; } else {
      this.airline_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.dot_code = null; } else {
      this.dot_code = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.fl_number = null; } else {
      this.fl_number = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.origin = null; } else {
      this.origin = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.origin_city = null; } else {
      this.origin_city = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.dest = null; } else {
      this.dest = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.dest_city = null; } else {
      this.dest_city = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.crs_dep_time = null; } else {
      this.crs_dep_time = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.dep_time = null; } else {
      this.dep_time = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.dep_delay = null; } else {
      this.dep_delay = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.taxi_out = null; } else {
      this.taxi_out = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.wheels_off = null; } else {
      this.wheels_off = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.wheels_on = null; } else {
      this.wheels_on = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.taxi_in = null; } else {
      this.taxi_in = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.crs_arr_time = null; } else {
      this.crs_arr_time = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.arr_time = null; } else {
      this.arr_time = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.arr_delay = null; } else {
      this.arr_delay = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cancelled = null; } else {
      this.cancelled = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.cancellation_code = null; } else {
      this.cancellation_code = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.diverted = null; } else {
      this.diverted = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.crs_elapsed_time = null; } else {
      this.crs_elapsed_time = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.elapsed_time = null; } else {
      this.elapsed_time = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.air_time = null; } else {
      this.air_time = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.distance = null; } else {
      this.distance = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.delay_due_carrier = null; } else {
      this.delay_due_carrier = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.delay_due_weather = null; } else {
      this.delay_due_weather = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.delay_due_nas = null; } else {
      this.delay_due_nas = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.delay_due_security = null; } else {
      this.delay_due_security = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.delay_due_late_aircraft = null; } else {
      this.delay_due_late_aircraft = Double.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    codegen_flights o = (codegen_flights) super.clone();
    o.fl_date = (o.fl_date != null) ? (java.sql.Date) o.fl_date.clone() : null;
    return o;
  }

  public void clone0(codegen_flights o) throws CloneNotSupportedException {
    o.fl_date = (o.fl_date != null) ? (java.sql.Date) o.fl_date.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("fl_date", this.fl_date);
    __sqoop$field_map.put("airline", this.airline);
    __sqoop$field_map.put("airline_dot", this.airline_dot);
    __sqoop$field_map.put("airline_code", this.airline_code);
    __sqoop$field_map.put("dot_code", this.dot_code);
    __sqoop$field_map.put("fl_number", this.fl_number);
    __sqoop$field_map.put("origin", this.origin);
    __sqoop$field_map.put("origin_city", this.origin_city);
    __sqoop$field_map.put("dest", this.dest);
    __sqoop$field_map.put("dest_city", this.dest_city);
    __sqoop$field_map.put("crs_dep_time", this.crs_dep_time);
    __sqoop$field_map.put("dep_time", this.dep_time);
    __sqoop$field_map.put("dep_delay", this.dep_delay);
    __sqoop$field_map.put("taxi_out", this.taxi_out);
    __sqoop$field_map.put("wheels_off", this.wheels_off);
    __sqoop$field_map.put("wheels_on", this.wheels_on);
    __sqoop$field_map.put("taxi_in", this.taxi_in);
    __sqoop$field_map.put("crs_arr_time", this.crs_arr_time);
    __sqoop$field_map.put("arr_time", this.arr_time);
    __sqoop$field_map.put("arr_delay", this.arr_delay);
    __sqoop$field_map.put("cancelled", this.cancelled);
    __sqoop$field_map.put("cancellation_code", this.cancellation_code);
    __sqoop$field_map.put("diverted", this.diverted);
    __sqoop$field_map.put("crs_elapsed_time", this.crs_elapsed_time);
    __sqoop$field_map.put("elapsed_time", this.elapsed_time);
    __sqoop$field_map.put("air_time", this.air_time);
    __sqoop$field_map.put("distance", this.distance);
    __sqoop$field_map.put("delay_due_carrier", this.delay_due_carrier);
    __sqoop$field_map.put("delay_due_weather", this.delay_due_weather);
    __sqoop$field_map.put("delay_due_nas", this.delay_due_nas);
    __sqoop$field_map.put("delay_due_security", this.delay_due_security);
    __sqoop$field_map.put("delay_due_late_aircraft", this.delay_due_late_aircraft);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("fl_date", this.fl_date);
    __sqoop$field_map.put("airline", this.airline);
    __sqoop$field_map.put("airline_dot", this.airline_dot);
    __sqoop$field_map.put("airline_code", this.airline_code);
    __sqoop$field_map.put("dot_code", this.dot_code);
    __sqoop$field_map.put("fl_number", this.fl_number);
    __sqoop$field_map.put("origin", this.origin);
    __sqoop$field_map.put("origin_city", this.origin_city);
    __sqoop$field_map.put("dest", this.dest);
    __sqoop$field_map.put("dest_city", this.dest_city);
    __sqoop$field_map.put("crs_dep_time", this.crs_dep_time);
    __sqoop$field_map.put("dep_time", this.dep_time);
    __sqoop$field_map.put("dep_delay", this.dep_delay);
    __sqoop$field_map.put("taxi_out", this.taxi_out);
    __sqoop$field_map.put("wheels_off", this.wheels_off);
    __sqoop$field_map.put("wheels_on", this.wheels_on);
    __sqoop$field_map.put("taxi_in", this.taxi_in);
    __sqoop$field_map.put("crs_arr_time", this.crs_arr_time);
    __sqoop$field_map.put("arr_time", this.arr_time);
    __sqoop$field_map.put("arr_delay", this.arr_delay);
    __sqoop$field_map.put("cancelled", this.cancelled);
    __sqoop$field_map.put("cancellation_code", this.cancellation_code);
    __sqoop$field_map.put("diverted", this.diverted);
    __sqoop$field_map.put("crs_elapsed_time", this.crs_elapsed_time);
    __sqoop$field_map.put("elapsed_time", this.elapsed_time);
    __sqoop$field_map.put("air_time", this.air_time);
    __sqoop$field_map.put("distance", this.distance);
    __sqoop$field_map.put("delay_due_carrier", this.delay_due_carrier);
    __sqoop$field_map.put("delay_due_weather", this.delay_due_weather);
    __sqoop$field_map.put("delay_due_nas", this.delay_due_nas);
    __sqoop$field_map.put("delay_due_security", this.delay_due_security);
    __sqoop$field_map.put("delay_due_late_aircraft", this.delay_due_late_aircraft);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}

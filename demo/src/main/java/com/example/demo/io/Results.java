package com.example.demo.io;

import java.util.List;

/**
 * 天气返回结果
 */
public class Results {
    private Location location;
    private List<Daily> daily;
    private String last_update;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Daily> getDaily() {
        return daily;
    }

    public void setDaily(List<Daily> daily) {
        this.daily = daily;
    }

    public String getLast_update() {
        return last_update;
    }

    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }

    class Daily {
        private String date;
        private String text_day;
        private String code_day;
        private String text_night;
        private String code_night;
        private String high;
        private String low;
        private String precip;
        private String wind_scale;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getText_day() {
            return text_day;
        }

        public void setText_day(String text_day) {
            this.text_day = text_day;
        }

        public String getCode_day() {
            return code_day;
        }

        public void setCode_day(String code_day) {
            this.code_day = code_day;
        }

        public String getText_night() {
            return text_night;
        }

        public void setText_night(String text_night) {
            this.text_night = text_night;
        }

        public String getCode_night() {
            return code_night;
        }

        public void setCode_night(String code_night) {
            this.code_night = code_night;
        }

        public String getHigh() {
            return high;
        }

        public void setHigh(String high) {
            this.high = high;
        }

        public String getLow() {
            return low;
        }

        public void setLow(String low) {
            this.low = low;
        }

        public String getPrecip() {
            return precip;
        }

        public void setPrecip(String precip) {
            this.precip = precip;
        }

        public String getWind_scale() {
            return wind_scale;
        }

        public void setWind_scale(String wind_scale) {
            this.wind_scale = wind_scale;
        }
    }

    class Location {
        private String id;
        private String name;
        private String country;
        private String path;
        private String timezone;
        private String timezone_offset;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public String getTimezone() {
            return timezone;
        }

        public void setTimezone(String timezone) {
            this.timezone = timezone;
        }

        public String getTimezone_offset() {
            return timezone_offset;
        }

        public void setTimezone_offset(String timezone_offset) {
            this.timezone_offset = timezone_offset;
        }
    }
}

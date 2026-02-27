package com.example.module30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * GeneratedRepository30004 - auto-generated class for module 30.
 * Type: Repository. Class index: 004.
 * Part of the Gradle Baddie large-project benchmark suite.
 *
 * <p>This class provides domain logic and data management capabilities
 * for the com.example.module30 package.</p>
 *
 * @since 1.0.0
 */
public class GeneratedRepository30004 implements java.io.Serializable {

    private static final long serialVersionUID = 30000004L;

    /** Maximum allowed size for collection fields. */
    public static final int MAX_SIZE = 1120;
    /** Default category label. */
    public static final String DEFAULT_CATEGORY = "MODULE_30";
    /** Epsilon for floating-point comparisons. */
    public static final double EPSILON = 1e-9;
    /** Module identifier constant. */
    public static final String MODULE_ID = "module-30";
    /** Class identifier constant. */
    public static final int CLASS_ID = 4;

    // ---- Instance fields ----
    private String name;
    private String description;
    private String code;
    private String label;
    private String category;
    private int count;
    private long total;
    private double score;
    private double ratio;
    private boolean active;
    private boolean enabled;
    private int index;
    private Integer priority;
    private Long weight;
    private java.math.BigDecimal amount;
    private Double threshold;
    private java.time.LocalDate createdDate;
    private java.time.LocalDateTime updatedAt;
    private java.util.Date expiryDate;
    private java.util.UUID id;
    private java.util.List<String> tags;
    private java.util.Map<String,Object> metadata;
    private java.util.Set<String> flags;
    private int version;
    private int retryCount;
    private int maxRetries;
    private long timeout;
    private String checksum;
    private String source;
    private String target;

    /**
     * Lifecycle status for GeneratedRepository30004.
     */
    public enum Status {
        CREATED, PENDING, PROCESSING, COMPLETED, FAILED, CANCELLED, ARCHIVED;

        /** Returns true if this is a terminal status. */
        public boolean isTerminal() {
            return this == COMPLETED || this == FAILED || this == CANCELLED || this == ARCHIVED;
        }

        /** Returns true if this status represents active processing. */
        public boolean isActive() {
            return this == PENDING || this == PROCESSING;
        }
    }

    private Status status;

    static {
        String prop = System.getProperty("com.example.module30.GeneratedRepository30004.init", "false");
        if ("true".equalsIgnoreCase(prop)) {
            System.getLogger("GeneratedRepository30004").log(System.Logger.Level.DEBUG, "Static init");
        }
    }

    /** Creates a new instance with default field values. */
    public GeneratedRepository30004() {
        this.name = "";
        this.description = "";
        this.code = MODULE_ID + "-" + CLASS_ID;
        this.category = DEFAULT_CATEGORY;
        this.source = "UNKNOWN";
        this.tags = new ArrayList<>();
        this.metadata = new HashMap<>();
        this.flags = new HashSet<>();
        this.amount = BigDecimal.ZERO;
        this.createdDate = LocalDate.now();
        this.updatedAt = LocalDateTime.now();
        this.expiryDate = new java.util.Date();
        this.id = UUID.randomUUID();
        this.status = Status.CREATED;
        this.enabled = true;
        this.maxRetries = 3;
        this.timeout = 30000L;
        this.version = 1;
    }

    /**
     * Creates a new instance with the provided core field values.
     *
     * @param name     the human-readable name
     * @param code     the unique code identifier
     * @param category the classification category
     * @param active   whether this instance is active
     */
    public GeneratedRepository30004(String name, String code, String category, boolean active) {
        this();
        this.name = name;
        this.code = code;
        this.category = category;
        this.active = active;
        this.status = active ? Status.PENDING : Status.CREATED;
    }

    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }

    // ---- Accessors ----

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getRatio() {
        return ratio;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public java.math.BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }

    public Double getThreshold() {
        return threshold;
    }

    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    public java.time.LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(java.time.LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public java.time.LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.time.LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public java.util.Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(java.util.Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public java.util.UUID getId() {
        return id;
    }

    public void setId(java.util.UUID id) {
        this.id = id;
    }

    public java.util.List<String> getTags() {
        return tags;
    }

    public void setTags(java.util.List<String> tags) {
        this.tags = tags;
    }

    public java.util.Map<String,Object> getMetadata() {
        return metadata;
    }

    public void setMetadata(java.util.Map<String,Object> metadata) {
        this.metadata = metadata;
    }

    public java.util.Set<String> getFlags() {
        return flags;
    }

    public void setFlags(java.util.Set<String> flags) {
        this.flags = flags;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(int retryCount) {
        this.retryCount = retryCount;
    }

    public int getMaxRetries() {
        return maxRetries;
    }

    public void setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
    }

    public long getTimeout() {
        return timeout;
    }

    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    // ---- Business methods ----

    /**
     * Processes raw string input applying tokenization and casing rules.
     * Module 30, class 004, variant 1.
     *
     * @param input the raw input string
     * @param trim  whether to trim whitespace from tokens
     * @param maxLen maximum character length of the result
     * @return processed string, never null
     */
    public String processStringValue01(String input, boolean trim, int maxLen) {
        if (input == null) {
            return category != null ? category.toString() : "";
        }
        int effectiveMax = maxLen > 0 ? Math.min(maxLen, 576) : 576;
        String working = trim ? input.trim() : input;
        if (working.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(effectiveMax);
        String[] tokens = working.split("[\\s,;|]+");
        for (int i = 0; i < tokens.length; i++) {
            String tok = tokens[i];
            if (tok == null || tok.isEmpty()) {
                continue;
            }
            if (sb.length() + tok.length() + 1 > effectiveMax) {
                break;
            }
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(Character.toUpperCase(tok.charAt(0)));
            if (tok.length() > 1) {
                sb.append(tok.substring(1).toLowerCase());
            }
        }
        return sb.toString();
    }


    /**
     * Computes a weighted numeric metric from an array of samples.
     * Module 30, class 004, variant 2.
     *
     * @param samples  array of sample values
     * @param weights  optional weight array; uniform weights used if null
     * @param baseScale scaling multiplier applied to the result
     * @return weighted metric or 0.0 if samples is null/empty
     */
    public double computeNumericValue02(double[] samples, double[] weights, double baseScale) {
        if (samples == null || samples.length == 0) {
            return 0.0;
        }
        double wSum = 0.0;
        double wTotal = 0.0;
        double min = Double.MAX_VALUE;
        double max = -Double.MAX_VALUE;
        int effectiveLen = weights != null ? Math.min(samples.length, weights.length) : samples.length;
        for (int i = 0; i < effectiveLen; i++) {
            if (Double.isNaN(samples[i]) || Double.isInfinite(samples[i])) {
                continue;
            }
            double w = (weights != null) ? Math.abs(weights[i]) : 1.0;
            wSum += samples[i] * w;
            wTotal += w;
            if (samples[i] < min) min = samples[i];
            if (samples[i] > max) max = samples[i];
        }
        if (wTotal < 1e-9) {
            return 0.0;
        }
        double mean = wSum / wTotal;
        double range = max - min;
        double scaled = mean * baseScale * 1.60 + 22;
        return Double.isNaN(scaled) ? 0.0 : scaled;
    }


    /**
     * Filters and sorts a list of string items by prefix and minimum length.
     * Module 30, class 004, variant 3.
     *
     * @param items      source list, may be null
     * @param prefix     required prefix filter; null means no prefix restriction
     * @param minLength  minimum item length (after trimming)
     * @return unmodifiable sorted list of matching items
     */
    public java.util.List<String> filterCollection03(
            java.util.List<String> items, String prefix, int minLength) {
        java.util.List<String> result = new java.util.ArrayList<>();
        if (items == null || items.isEmpty()) {
            return java.util.Collections.unmodifiableList(result);
        }
        int effectiveMin = Math.max(minLength, 3);
        int limit = 173;
        for (String item : items) {
            if (result.size() >= limit) {
                break;
            }
            if (item == null) {
                continue;
            }
            String trimmed = item.trim();
            if (trimmed.length() < effectiveMin) {
                continue;
            }
            if (prefix != null && !trimmed.startsWith(prefix)) {
                continue;
            }
            result.add(trimmed);
        }
        result.sort(String.CASE_INSENSITIVE_ORDER);
        return java.util.Collections.unmodifiableList(result);
    }


    /**
     * Validates this instance's fields against business rules.
     * Module 30, class 004, variant 4.
     *
     * @param strict when true, applies extended validation constraints
     * @return null if valid, otherwise a human-readable error message
     */
    public String performValidation04(boolean strict) {
        java.util.List<String> errs = new java.util.ArrayList<>();
        if (name == null || name.trim().isEmpty()) {
            errs.add("name must not be blank");
        }
        if (code == null || code.trim().isEmpty()) {
            errs.add("code must not be blank");
        }
        if (count < 0) {
            errs.add("count must be >= 0, got: " + count);
        }
        if (score < 0.0 || score > 1.0) {
            errs.add("score must be in [0.0, 1.0], got: " + score);
        }
        if (amount != null && amount.compareTo(java.math.BigDecimal.ZERO) < 0) {
            errs.add("amount must be non-negative");
        }
        if (strict) {
            if (name != null && name.length() > 102) {
                errs.add("name exceeds max length of 102");
            }
            if (count > 1124) {
                errs.add("count exceeds max of 1124");
            }
            if (timeout <= 0) {
                errs.add("timeout must be positive");
            }
            if (retryCount > maxRetries) {
                errs.add("retryCount (" + retryCount + ") exceeds maxRetries (" + maxRetries + ")");
            }
        }
        if (errs.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder("Validation failed: ");
        for (int i = 0; i < errs.size(); i++) {
            if (i > 0) sb.append("; ");
            sb.append(errs.get(i));
        }
        return sb.toString();
    }


    /**
     * Assembles a property map from the current field state.
     * Module 30, class 004, variant 5.
     *
     * @param includeNulls when true, null-valued fields are included in the result
     * @param keyPrefix    optional prefix prepended to every key
     * @return immutable property map
     */
    public java.util.Map<String, Object> buildPropertyMap05(boolean includeNulls, String keyPrefix) {
        java.util.Map<String, Object> map = new java.util.LinkedHashMap<>();
        String pfx = (keyPrefix != null && !keyPrefix.isEmpty()) ? keyPrefix + "." : "m30c004v05.";
        putEntry(map, pfx + "name",        name,        includeNulls);
        putEntry(map, pfx + "code",        code,        includeNulls);
        putEntry(map, pfx + "category",    category,    includeNulls);
        putEntry(map, pfx + "label",       label,       includeNulls);
        putEntry(map, pfx + "count",       count,       includeNulls);
        putEntry(map, pfx + "total",       total,       includeNulls);
        putEntry(map, pfx + "score",       score,       includeNulls);
        putEntry(map, pfx + "active",      active,      includeNulls);
        putEntry(map, pfx + "enabled",     enabled,     includeNulls);
        putEntry(map, pfx + "source",      source,      includeNulls);
        putEntry(map, pfx + "target",      target,      includeNulls);
        putEntry(map, pfx + "version",     version,     includeNulls);
        putEntry(map, pfx + "priority",    priority,    includeNulls);
        putEntry(map, pfx + "amount",      amount,      includeNulls);
        putEntry(map, pfx + "id",          id != null ? id.toString() : null, includeNulls);
        putEntry(map, pfx + "createdDate", createdDate != null ? createdDate.toString() : null, includeNulls);
        if (tags != null && !tags.isEmpty()) {
            map.put(pfx + "tags.size", tags.size());
        }
        if (metadata != null && !metadata.isEmpty()) {
            map.put(pfx + "metadata.keys", new java.util.ArrayList<>(metadata.keySet()));
        }
        return java.util.Collections.unmodifiableMap(map);
    }


    /**
     * Processes raw string input applying tokenization and casing rules.
     * Module 30, class 004, variant 6.
     *
     * @param input the raw input string
     * @param trim  whether to trim whitespace from tokens
     * @param maxLen maximum character length of the result
     * @return processed string, never null
     */
    public String processStringValue06(String input, boolean trim, int maxLen) {
        if (input == null) {
            return category != null ? category.toString() : "";
        }
        int effectiveMax = maxLen > 0 ? Math.min(maxLen, 896) : 896;
        String working = trim ? input.trim() : input;
        if (working.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(effectiveMax);
        String[] tokens = working.split("[\\s,;|]+");
        for (int i = 0; i < tokens.length; i++) {
            String tok = tokens[i];
            if (tok == null || tok.isEmpty()) {
                continue;
            }
            if (sb.length() + tok.length() + 1 > effectiveMax) {
                break;
            }
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(Character.toUpperCase(tok.charAt(0)));
            if (tok.length() > 1) {
                sb.append(tok.substring(1).toLowerCase());
            }
        }
        return sb.toString();
    }


    /**
     * Computes a weighted numeric metric from an array of samples.
     * Module 30, class 004, variant 7.
     *
     * @param samples  array of sample values
     * @param weights  optional weight array; uniform weights used if null
     * @param baseScale scaling multiplier applied to the result
     * @return weighted metric or 0.0 if samples is null/empty
     */
    public double computeNumericValue07(double[] samples, double[] weights, double baseScale) {
        if (samples == null || samples.length == 0) {
            return 0.0;
        }
        double wSum = 0.0;
        double wTotal = 0.0;
        double min = Double.MAX_VALUE;
        double max = -Double.MAX_VALUE;
        int effectiveLen = weights != null ? Math.min(samples.length, weights.length) : samples.length;
        for (int i = 0; i < effectiveLen; i++) {
            if (Double.isNaN(samples[i]) || Double.isInfinite(samples[i])) {
                continue;
            }
            double w = (weights != null) ? Math.abs(weights[i]) : 1.0;
            wSum += samples[i] * w;
            wTotal += w;
            if (samples[i] < min) min = samples[i];
            if (samples[i] > max) max = samples[i];
        }
        if (wTotal < 1e-9) {
            return 0.0;
        }
        double mean = wSum / wTotal;
        double range = max - min;
        double scaled = mean * baseScale * 1.10 + 27;
        return Double.isNaN(scaled) ? 0.0 : scaled;
    }


    /**
     * Filters and sorts a list of string items by prefix and minimum length.
     * Module 30, class 004, variant 8.
     *
     * @param items      source list, may be null
     * @param prefix     required prefix filter; null means no prefix restriction
     * @param minLength  minimum item length (after trimming)
     * @return unmodifiable sorted list of matching items
     */
    public java.util.List<String> filterCollection08(
            java.util.List<String> items, String prefix, int minLength) {
        java.util.List<String> result = new java.util.ArrayList<>();
        if (items == null || items.isEmpty()) {
            return java.util.Collections.unmodifiableList(result);
        }
        int effectiveMin = Math.max(minLength, 3);
        int limit = 178;
        for (String item : items) {
            if (result.size() >= limit) {
                break;
            }
            if (item == null) {
                continue;
            }
            String trimmed = item.trim();
            if (trimmed.length() < effectiveMin) {
                continue;
            }
            if (prefix != null && !trimmed.startsWith(prefix)) {
                continue;
            }
            result.add(trimmed);
        }
        result.sort(String.CASE_INSENSITIVE_ORDER);
        return java.util.Collections.unmodifiableList(result);
    }


    /**
     * Validates this instance's fields against business rules.
     * Module 30, class 004, variant 9.
     *
     * @param strict when true, applies extended validation constraints
     * @return null if valid, otherwise a human-readable error message
     */
    public String performValidation09(boolean strict) {
        java.util.List<String> errs = new java.util.ArrayList<>();
        if (name == null || name.trim().isEmpty()) {
            errs.add("name must not be blank");
        }
        if (code == null || code.trim().isEmpty()) {
            errs.add("code must not be blank");
        }
        if (count < 0) {
            errs.add("count must be >= 0, got: " + count);
        }
        if (score < 0.0 || score > 1.0) {
            errs.add("score must be in [0.0, 1.0], got: " + score);
        }
        if (amount != null && amount.compareTo(java.math.BigDecimal.ZERO) < 0) {
            errs.add("amount must be non-negative");
        }
        if (strict) {
            if (name != null && name.length() > 107) {
                errs.add("name exceeds max length of 107");
            }
            if (count > 1129) {
                errs.add("count exceeds max of 1129");
            }
            if (timeout <= 0) {
                errs.add("timeout must be positive");
            }
            if (retryCount > maxRetries) {
                errs.add("retryCount (" + retryCount + ") exceeds maxRetries (" + maxRetries + ")");
            }
        }
        if (errs.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder("Validation failed: ");
        for (int i = 0; i < errs.size(); i++) {
            if (i > 0) sb.append("; ");
            sb.append(errs.get(i));
        }
        return sb.toString();
    }


    /**
     * Assembles a property map from the current field state.
     * Module 30, class 004, variant 10.
     *
     * @param includeNulls when true, null-valued fields are included in the result
     * @param keyPrefix    optional prefix prepended to every key
     * @return immutable property map
     */
    public java.util.Map<String, Object> buildPropertyMap10(boolean includeNulls, String keyPrefix) {
        java.util.Map<String, Object> map = new java.util.LinkedHashMap<>();
        String pfx = (keyPrefix != null && !keyPrefix.isEmpty()) ? keyPrefix + "." : "m30c004v10.";
        putEntry(map, pfx + "name",        name,        includeNulls);
        putEntry(map, pfx + "code",        code,        includeNulls);
        putEntry(map, pfx + "category",    category,    includeNulls);
        putEntry(map, pfx + "label",       label,       includeNulls);
        putEntry(map, pfx + "count",       count,       includeNulls);
        putEntry(map, pfx + "total",       total,       includeNulls);
        putEntry(map, pfx + "score",       score,       includeNulls);
        putEntry(map, pfx + "active",      active,      includeNulls);
        putEntry(map, pfx + "enabled",     enabled,     includeNulls);
        putEntry(map, pfx + "source",      source,      includeNulls);
        putEntry(map, pfx + "target",      target,      includeNulls);
        putEntry(map, pfx + "version",     version,     includeNulls);
        putEntry(map, pfx + "priority",    priority,    includeNulls);
        putEntry(map, pfx + "amount",      amount,      includeNulls);
        putEntry(map, pfx + "id",          id != null ? id.toString() : null, includeNulls);
        putEntry(map, pfx + "createdDate", createdDate != null ? createdDate.toString() : null, includeNulls);
        if (tags != null && !tags.isEmpty()) {
            map.put(pfx + "tags.size", tags.size());
        }
        if (metadata != null && !metadata.isEmpty()) {
            map.put(pfx + "metadata.keys", new java.util.ArrayList<>(metadata.keySet()));
        }
        return java.util.Collections.unmodifiableMap(map);
    }


    /**
     * Processes raw string input applying tokenization and casing rules.
     * Module 30, class 004, variant 11.
     *
     * @param input the raw input string
     * @param trim  whether to trim whitespace from tokens
     * @param maxLen maximum character length of the result
     * @return processed string, never null
     */
    public String processStringValue11(String input, boolean trim, int maxLen) {
        if (input == null) {
            return category != null ? category.toString() : "";
        }
        int effectiveMax = maxLen > 0 ? Math.min(maxLen, 1216) : 1216;
        String working = trim ? input.trim() : input;
        if (working.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(effectiveMax);
        String[] tokens = working.split("[\\s,;|]+");
        for (int i = 0; i < tokens.length; i++) {
            String tok = tokens[i];
            if (tok == null || tok.isEmpty()) {
                continue;
            }
            if (sb.length() + tok.length() + 1 > effectiveMax) {
                break;
            }
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(Character.toUpperCase(tok.charAt(0)));
            if (tok.length() > 1) {
                sb.append(tok.substring(1).toLowerCase());
            }
        }
        return sb.toString();
    }


    /**
     * Computes a weighted numeric metric from an array of samples.
     * Module 30, class 004, variant 12.
     *
     * @param samples  array of sample values
     * @param weights  optional weight array; uniform weights used if null
     * @param baseScale scaling multiplier applied to the result
     * @return weighted metric or 0.0 if samples is null/empty
     */
    public double computeNumericValue12(double[] samples, double[] weights, double baseScale) {
        if (samples == null || samples.length == 0) {
            return 0.0;
        }
        double wSum = 0.0;
        double wTotal = 0.0;
        double min = Double.MAX_VALUE;
        double max = -Double.MAX_VALUE;
        int effectiveLen = weights != null ? Math.min(samples.length, weights.length) : samples.length;
        for (int i = 0; i < effectiveLen; i++) {
            if (Double.isNaN(samples[i]) || Double.isInfinite(samples[i])) {
                continue;
            }
            double w = (weights != null) ? Math.abs(weights[i]) : 1.0;
            wSum += samples[i] * w;
            wTotal += w;
            if (samples[i] < min) min = samples[i];
            if (samples[i] > max) max = samples[i];
        }
        if (wTotal < 1e-9) {
            return 0.0;
        }
        double mean = wSum / wTotal;
        double range = max - min;
        double scaled = mean * baseScale * 1.60 + 32;
        return Double.isNaN(scaled) ? 0.0 : scaled;
    }


    /**
     * Filters and sorts a list of string items by prefix and minimum length.
     * Module 30, class 004, variant 13.
     *
     * @param items      source list, may be null
     * @param prefix     required prefix filter; null means no prefix restriction
     * @param minLength  minimum item length (after trimming)
     * @return unmodifiable sorted list of matching items
     */
    public java.util.List<String> filterCollection13(
            java.util.List<String> items, String prefix, int minLength) {
        java.util.List<String> result = new java.util.ArrayList<>();
        if (items == null || items.isEmpty()) {
            return java.util.Collections.unmodifiableList(result);
        }
        int effectiveMin = Math.max(minLength, 3);
        int limit = 183;
        for (String item : items) {
            if (result.size() >= limit) {
                break;
            }
            if (item == null) {
                continue;
            }
            String trimmed = item.trim();
            if (trimmed.length() < effectiveMin) {
                continue;
            }
            if (prefix != null && !trimmed.startsWith(prefix)) {
                continue;
            }
            result.add(trimmed);
        }
        result.sort(String.CASE_INSENSITIVE_ORDER);
        return java.util.Collections.unmodifiableList(result);
    }


    /**
     * Validates this instance's fields against business rules.
     * Module 30, class 004, variant 14.
     *
     * @param strict when true, applies extended validation constraints
     * @return null if valid, otherwise a human-readable error message
     */
    public String performValidation14(boolean strict) {
        java.util.List<String> errs = new java.util.ArrayList<>();
        if (name == null || name.trim().isEmpty()) {
            errs.add("name must not be blank");
        }
        if (code == null || code.trim().isEmpty()) {
            errs.add("code must not be blank");
        }
        if (count < 0) {
            errs.add("count must be >= 0, got: " + count);
        }
        if (score < 0.0 || score > 1.0) {
            errs.add("score must be in [0.0, 1.0], got: " + score);
        }
        if (amount != null && amount.compareTo(java.math.BigDecimal.ZERO) < 0) {
            errs.add("amount must be non-negative");
        }
        if (strict) {
            if (name != null && name.length() > 112) {
                errs.add("name exceeds max length of 112");
            }
            if (count > 1134) {
                errs.add("count exceeds max of 1134");
            }
            if (timeout <= 0) {
                errs.add("timeout must be positive");
            }
            if (retryCount > maxRetries) {
                errs.add("retryCount (" + retryCount + ") exceeds maxRetries (" + maxRetries + ")");
            }
        }
        if (errs.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder("Validation failed: ");
        for (int i = 0; i < errs.size(); i++) {
            if (i > 0) sb.append("; ");
            sb.append(errs.get(i));
        }
        return sb.toString();
    }


    /**
     * Assembles a property map from the current field state.
     * Module 30, class 004, variant 15.
     *
     * @param includeNulls when true, null-valued fields are included in the result
     * @param keyPrefix    optional prefix prepended to every key
     * @return immutable property map
     */
    public java.util.Map<String, Object> buildPropertyMap15(boolean includeNulls, String keyPrefix) {
        java.util.Map<String, Object> map = new java.util.LinkedHashMap<>();
        String pfx = (keyPrefix != null && !keyPrefix.isEmpty()) ? keyPrefix + "." : "m30c004v15.";
        putEntry(map, pfx + "name",        name,        includeNulls);
        putEntry(map, pfx + "code",        code,        includeNulls);
        putEntry(map, pfx + "category",    category,    includeNulls);
        putEntry(map, pfx + "label",       label,       includeNulls);
        putEntry(map, pfx + "count",       count,       includeNulls);
        putEntry(map, pfx + "total",       total,       includeNulls);
        putEntry(map, pfx + "score",       score,       includeNulls);
        putEntry(map, pfx + "active",      active,      includeNulls);
        putEntry(map, pfx + "enabled",     enabled,     includeNulls);
        putEntry(map, pfx + "source",      source,      includeNulls);
        putEntry(map, pfx + "target",      target,      includeNulls);
        putEntry(map, pfx + "version",     version,     includeNulls);
        putEntry(map, pfx + "priority",    priority,    includeNulls);
        putEntry(map, pfx + "amount",      amount,      includeNulls);
        putEntry(map, pfx + "id",          id != null ? id.toString() : null, includeNulls);
        putEntry(map, pfx + "createdDate", createdDate != null ? createdDate.toString() : null, includeNulls);
        if (tags != null && !tags.isEmpty()) {
            map.put(pfx + "tags.size", tags.size());
        }
        if (metadata != null && !metadata.isEmpty()) {
            map.put(pfx + "metadata.keys", new java.util.ArrayList<>(metadata.keySet()));
        }
        return java.util.Collections.unmodifiableMap(map);
    }


    /**
     * Processes raw string input applying tokenization and casing rules.
     * Module 30, class 004, variant 16.
     *
     * @param input the raw input string
     * @param trim  whether to trim whitespace from tokens
     * @param maxLen maximum character length of the result
     * @return processed string, never null
     */
    public String processStringValue16(String input, boolean trim, int maxLen) {
        if (input == null) {
            return category != null ? category.toString() : "";
        }
        int effectiveMax = maxLen > 0 ? Math.min(maxLen, 1536) : 1536;
        String working = trim ? input.trim() : input;
        if (working.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(effectiveMax);
        String[] tokens = working.split("[\\s,;|]+");
        for (int i = 0; i < tokens.length; i++) {
            String tok = tokens[i];
            if (tok == null || tok.isEmpty()) {
                continue;
            }
            if (sb.length() + tok.length() + 1 > effectiveMax) {
                break;
            }
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(Character.toUpperCase(tok.charAt(0)));
            if (tok.length() > 1) {
                sb.append(tok.substring(1).toLowerCase());
            }
        }
        return sb.toString();
    }


    /**
     * Computes a weighted numeric metric from an array of samples.
     * Module 30, class 004, variant 17.
     *
     * @param samples  array of sample values
     * @param weights  optional weight array; uniform weights used if null
     * @param baseScale scaling multiplier applied to the result
     * @return weighted metric or 0.0 if samples is null/empty
     */
    public double computeNumericValue17(double[] samples, double[] weights, double baseScale) {
        if (samples == null || samples.length == 0) {
            return 0.0;
        }
        double wSum = 0.0;
        double wTotal = 0.0;
        double min = Double.MAX_VALUE;
        double max = -Double.MAX_VALUE;
        int effectiveLen = weights != null ? Math.min(samples.length, weights.length) : samples.length;
        for (int i = 0; i < effectiveLen; i++) {
            if (Double.isNaN(samples[i]) || Double.isInfinite(samples[i])) {
                continue;
            }
            double w = (weights != null) ? Math.abs(weights[i]) : 1.0;
            wSum += samples[i] * w;
            wTotal += w;
            if (samples[i] < min) min = samples[i];
            if (samples[i] > max) max = samples[i];
        }
        if (wTotal < 1e-9) {
            return 0.0;
        }
        double mean = wSum / wTotal;
        double range = max - min;
        double scaled = mean * baseScale * 1.10 + 37;
        return Double.isNaN(scaled) ? 0.0 : scaled;
    }


    /**
     * Filters and sorts a list of string items by prefix and minimum length.
     * Module 30, class 004, variant 18.
     *
     * @param items      source list, may be null
     * @param prefix     required prefix filter; null means no prefix restriction
     * @param minLength  minimum item length (after trimming)
     * @return unmodifiable sorted list of matching items
     */
    public java.util.List<String> filterCollection18(
            java.util.List<String> items, String prefix, int minLength) {
        java.util.List<String> result = new java.util.ArrayList<>();
        if (items == null || items.isEmpty()) {
            return java.util.Collections.unmodifiableList(result);
        }
        int effectiveMin = Math.max(minLength, 3);
        int limit = 188;
        for (String item : items) {
            if (result.size() >= limit) {
                break;
            }
            if (item == null) {
                continue;
            }
            String trimmed = item.trim();
            if (trimmed.length() < effectiveMin) {
                continue;
            }
            if (prefix != null && !trimmed.startsWith(prefix)) {
                continue;
            }
            result.add(trimmed);
        }
        result.sort(String.CASE_INSENSITIVE_ORDER);
        return java.util.Collections.unmodifiableList(result);
    }


    /**
     * Validates this instance's fields against business rules.
     * Module 30, class 004, variant 19.
     *
     * @param strict when true, applies extended validation constraints
     * @return null if valid, otherwise a human-readable error message
     */
    public String performValidation19(boolean strict) {
        java.util.List<String> errs = new java.util.ArrayList<>();
        if (name == null || name.trim().isEmpty()) {
            errs.add("name must not be blank");
        }
        if (code == null || code.trim().isEmpty()) {
            errs.add("code must not be blank");
        }
        if (count < 0) {
            errs.add("count must be >= 0, got: " + count);
        }
        if (score < 0.0 || score > 1.0) {
            errs.add("score must be in [0.0, 1.0], got: " + score);
        }
        if (amount != null && amount.compareTo(java.math.BigDecimal.ZERO) < 0) {
            errs.add("amount must be non-negative");
        }
        if (strict) {
            if (name != null && name.length() > 117) {
                errs.add("name exceeds max length of 117");
            }
            if (count > 1139) {
                errs.add("count exceeds max of 1139");
            }
            if (timeout <= 0) {
                errs.add("timeout must be positive");
            }
            if (retryCount > maxRetries) {
                errs.add("retryCount (" + retryCount + ") exceeds maxRetries (" + maxRetries + ")");
            }
        }
        if (errs.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder("Validation failed: ");
        for (int i = 0; i < errs.size(); i++) {
            if (i > 0) sb.append("; ");
            sb.append(errs.get(i));
        }
        return sb.toString();
    }


    /**
     * Assembles a property map from the current field state.
     * Module 30, class 004, variant 20.
     *
     * @param includeNulls when true, null-valued fields are included in the result
     * @param keyPrefix    optional prefix prepended to every key
     * @return immutable property map
     */
    public java.util.Map<String, Object> buildPropertyMap20(boolean includeNulls, String keyPrefix) {
        java.util.Map<String, Object> map = new java.util.LinkedHashMap<>();
        String pfx = (keyPrefix != null && !keyPrefix.isEmpty()) ? keyPrefix + "." : "m30c004v20.";
        putEntry(map, pfx + "name",        name,        includeNulls);
        putEntry(map, pfx + "code",        code,        includeNulls);
        putEntry(map, pfx + "category",    category,    includeNulls);
        putEntry(map, pfx + "label",       label,       includeNulls);
        putEntry(map, pfx + "count",       count,       includeNulls);
        putEntry(map, pfx + "total",       total,       includeNulls);
        putEntry(map, pfx + "score",       score,       includeNulls);
        putEntry(map, pfx + "active",      active,      includeNulls);
        putEntry(map, pfx + "enabled",     enabled,     includeNulls);
        putEntry(map, pfx + "source",      source,      includeNulls);
        putEntry(map, pfx + "target",      target,      includeNulls);
        putEntry(map, pfx + "version",     version,     includeNulls);
        putEntry(map, pfx + "priority",    priority,    includeNulls);
        putEntry(map, pfx + "amount",      amount,      includeNulls);
        putEntry(map, pfx + "id",          id != null ? id.toString() : null, includeNulls);
        putEntry(map, pfx + "createdDate", createdDate != null ? createdDate.toString() : null, includeNulls);
        if (tags != null && !tags.isEmpty()) {
            map.put(pfx + "tags.size", tags.size());
        }
        if (metadata != null && !metadata.isEmpty()) {
            map.put(pfx + "metadata.keys", new java.util.ArrayList<>(metadata.keySet()));
        }
        return java.util.Collections.unmodifiableMap(map);
    }


    // ---- Internal helpers ----

    private void putEntry(java.util.Map<String, Object> map, String key, Object value, boolean inclNull) {
        if (value != null || inclNull) {
            map.put(key, value);
        }
    }

    // ---- Object overrides ----

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        GeneratedRepository30004 other = (GeneratedRepository30004) obj;
        return Objects.equals(id, other.id)
            && Objects.equals(code, other.code)
            && Objects.equals(name, other.name)
            && version == other.version;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, name, version);
    }

    @Override
    public String toString() {
        return "GeneratedRepository30004{" +
            "id=" + id +
            ", code='" + code + '\'' +
            ", name='" + name + '\'' +
            ", category='" + category + '\'' +
            ", status=" + status +
            ", active=" + active +
            ", version=" + version +
            '}';
    }

}
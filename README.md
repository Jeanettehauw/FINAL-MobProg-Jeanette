# Mobile Programming Assignment: API Consumption (Kotlin)
This project is an Android application developed in Kotlin that demonstrates how to consume a REST API using Retrofit 2. The app follows specific academic requirements based on the student's identification number (NIM).

## 👤 Student Profile
**Name**: Jeanette Hauw Chandra
**NIM**: 2702323276

## 📋 Assignment Specifications
Based on the student ID (NIM) ending in **6**, this project fulfills the following criteria:
* **Data Source:** [JSONPlaceholder Users Service](https://jsonplaceholder.typicode.com/users)
* **Fields Displayed:** User's **Username** and **Email**
* **Application Flow:**
    1. **List Screen:** Fetches and displays a list of users from the API service
    2. **Navigation:** Selecting a specific user redirects the app to the Detail Screen
    3. **Detail Screen:** Displays the student's personal identification (Name & NIM) along with the detailed attributes of the selected user

## 🛠 Technical Stack
The application is built using the following libraries and tools:

| Category | Technology |
| :--- | :--- |
| **Language** | Kotlin |
| **Networking** | **Retrofit 2** & **GSON Converter** (JSON Parsing) |
| **Threading** | **Kotlin Coroutines** & **Lifecycle KTX** (lifecycleScope) |
| **UI Binding** | **ViewBinding** (Safe layout access) |
| **UI Components** | RecyclerView, ConstraintLayout, LinearLayout |  

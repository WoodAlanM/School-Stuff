import csv

csv_file_path = 'SandC.csv'
output_file_path = 'SandCedited.csv'

# Function to wrap and remove spaces from each element
def process_row(row):
    return [element.replace(' ', '') for element in row]

# Reading CSV, processing, and writing to a new CSV
with open(csv_file_path, 'r') as file:
    csv_reader = csv.reader(file)
    
    # Process and write to a new CSV
    with open(output_file_path, 'w', newline='') as output_file:
        csv_writer = csv.writer(output_file, quoting=csv.QUOTE_ALL)
        
        for row in csv_reader:
            processed_row = process_row(row)
            csv_writer.writerow(processed_row)

print(f"Processed CSV saved to: {output_file_path}")
